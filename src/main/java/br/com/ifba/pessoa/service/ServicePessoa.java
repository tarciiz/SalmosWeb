/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.pessoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.infrastructure.support.StringUtil;
import br.com.ifba.pessoa.dao.IDaoPessoa;
import br.com.ifba.pessoa.model.Pessoa;

/**
 *
 * @author matheus lima
 */
@Service
public class ServicePessoa implements IServicePessoa {

    // OBJETO
    @Autowired
    private IDaoPessoa daoPessoa;

    // CONSTANTES

    // mensagem de erro se o Pessoa for null;
    public final static String Pessoa_NULL = "Usuário null";

    // mensagem de erro se o Pessoa já existir;
    public final static String Pessoa_EXISTE = "O Usuário já existe,";

    // mensagem de erro se o Pessoa não existir no banco;
    public final static String Pessoa_NAO_EXISTE = "O Usuário não existe na base de dados";

    // mensagem de erro se o Pessoa for inválido;
    public final static String Pessoa_INVALIDO = "Usuário inválido";

    @Override
    public Pessoa savePessoa(Pessoa pessoa) {
        if (pessoa == null) {
            throw new BusinessException(Pessoa_NULL);
        }

        // O Pessoa já existe e está atualizando o usuário
        Pessoa oldPessoa = this.findById(pessoa.getId());
        if (oldPessoa != null) {
            System.out.println("O Pessoa está sendo atualizado " + pessoa.getId());
            // Busca o usuário salvo no banco para atualizar a senha somente se mudar

            // Verifica se a senha foi atualizada
            if (pessoa.getNome() != StringUtil.toMD5(pessoa.getNome())) {
                pessoa.setNome(StringUtil.toMD5(pessoa.getNome()));
            }
        } else {
            // O Pessoa está sendo inserido
            System.out.println("O Pessoa está sendo inserido");
            pessoa.setNome(StringUtil.toMD5(pessoa.getNome()));
        }

        return daoPessoa.save(pessoa);
    }

    @Override
    public void deletePessoa(Pessoa pessoa) {
        if (pessoa == null) {
            throw new BusinessException(Pessoa_NULL);
        } else {
            this.daoPessoa.delete(pessoa);
            return;
        }
    }

    @Override
    public List<Pessoa> getAllPessoas() {
        return (List<Pessoa>) this.daoPessoa.findAll();
    }

    @Override
    public List<Pessoa> findByNome(String name) {
        if (name == null) {
            throw new BusinessException("Nome null");
        } else if (name.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return daoPessoa.findByNome(name);
        }
    }

    @Override
    public Pessoa findById(Long id) {
        Optional<Pessoa> pessoa = daoPessoa.findById(id);
        return pessoa.isPresent() ? pessoa.get() : null;
    }

    /*
    @Override
    public Pessoa findByLoginOrEmailAndSenha(String login, String email, String senha) {
        Optional<Pessoa> pessoa = daoPessoa.findByLoginOrEmailAndSenha(login, email, senha);
        return pessoa.isPresent() ? pessoa.get() : null;
    }
    */
}
