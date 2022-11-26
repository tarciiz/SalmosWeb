/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.tiposdeusuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifba.salmos.infrastructure.exception.BusinessException;
import br.com.ifba.salmos.tiposdeusuario.dao.IDaoTipoDeUsuario;
import br.com.ifba.salmos.tiposdeusuario.model.TipoDeUsuario;
//import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Igor Lopes e Eduarda
 */
@Service
public class ServiceTipoDeUsuario implements IServiceTipoDeUsuario {

    // CONSTANTES

    // mensagem de erro se o Usuario for null;
    public final static String USUARIO_NULL = "Tipo de Usuário null";

    // mensagem de erro se o Usuario já existir;
    public final static String USUARIO_EXISTE = "O Tipo de Usuário já existe,";

    // mensagem de erro se o Usuario não existir no banco;
    public final static String USUARIO_NAO_EXISTE = "O Tipo de Usuário não existe na base de dados";

    // mensagem de erro se o Usuario for inválido;
    public final static String USUARIO_INVALIDO = "Tipo de Usuário inválido";

    // OBJETO
    @Autowired
    private IDaoTipoDeUsuario daoTipoDeUsuario;

    @Override
    public TipoDeUsuario saveTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        if (tipoDeUsuario == null) {
            throw new BusinessException(USUARIO_NULL);
        } else {
            return daoTipoDeUsuario.save(tipoDeUsuario);
        }
    }

    @Override
    public TipoDeUsuario updateTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        if (tipoDeUsuario == null) {
            throw new BusinessException(USUARIO_NULL);
        } else if (daoTipoDeUsuario.findById(tipoDeUsuario.getId()) == null) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        } else {
            return daoTipoDeUsuario.save(tipoDeUsuario);
        }
    }

    @Override
    public void deleteTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        if (tipoDeUsuario == null) {
            throw new BusinessException(USUARIO_NULL);
        } else {
            this.daoTipoDeUsuario.delete(tipoDeUsuario);
            return;
        }
    }

    @Override
    public List<TipoDeUsuario> getAllTipoDeUsuario() {
        return (List<TipoDeUsuario>)this.daoTipoDeUsuario.findAll();
    }

    @Override
    public List<TipoDeUsuario> findByNome(String name) {
        if (name == null) {
            throw new BusinessException("Nome null");
        } else if (name.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return daoTipoDeUsuario.findByNome(name);
        }
    }

}
