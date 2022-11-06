/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.usuario.service;

import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 *
 * @author vitor
 */
@Service
public interface IServiceUsuario {

    public abstract Usuario saveUsuario(Usuario usuario);

    public abstract void deleteUsuario(Usuario usuario);

    public abstract List<Usuario> getAllUsuarios();

    public List<Usuario> findByNome(String name);

    public Usuario findById(Long id);

    public Usuario findByLoginOrEmailAndSenha(String login, String email, String senha);

}
