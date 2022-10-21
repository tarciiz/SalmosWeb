/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.usuario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ifba.salmos.infrastructure.exception.BusinessException;
import br.com.ifba.salmos.usuario.dao.IDaoUsuario;
import br.com.ifba.salmos.usuario.model.Usuario;

/**
 *
 * @author vitor
 */
@Service
public class ServiceUsuario implements IServiceUsuario{
    
    //OBJETO
    private IDaoUsuario daoUsuario;

    //CONSTANTES
    
    //mensagem de erro se o Usuario for null;
    public final static String USUARIO_NULL = "Usuário null";
    
    //mensagem de erro se o Usuario já existir;
    public final static String USUARIO_EXISTE = "O Usuário já existe,";
    
    //mensagem de erro se o Usuario não existir no banco;
    public final static String USUARIO_NAO_EXISTE = "O Usuário não existe na base de dados";
    
    //mensagem de erro se o Usuario for inválido;
    public final static String USUARIO_INVALIDO = "Usuário inválido";
    
    @Override
    public Usuario saveUsuario(Usuario usuario) {
        if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
        } else if(daoUsuario.findById(usuario.getId()) != null){
            throw new BusinessException(USUARIO_EXISTE);
        } else {
            return daoUsuario.save(usuario);
        }
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
        }else if(this.daoUsuario.findById(usuario.getId()) != null) {
            this.daoUsuario.delete(usuario);
            return;
        }
            throw new BusinessException(USUARIO_NAO_EXISTE);    
}

    @Override
    public List<Usuario> getAllUsuarios() {
        return this.daoUsuario.findAll();    
    }

    @Override
    public List<Usuario> findByName(String name) {
        if(name == null) {
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return daoUsuario.findByName(name);
        }    
    }
    
}
