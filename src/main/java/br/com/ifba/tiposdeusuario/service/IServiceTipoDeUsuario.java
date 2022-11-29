/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.tiposdeusuario.service;

import java.util.List;

import br.com.ifba.tiposdeusuario.model.TipoDeUsuario;

/**
 *
 * @author Igor Lopes e Eduarda
 */
public interface IServiceTipoDeUsuario {
    public abstract TipoDeUsuario saveTipoDeUsuario(TipoDeUsuario tipoDeUsuario);

    public abstract TipoDeUsuario updateTipoDeUsuario(TipoDeUsuario tipoDeUsuario);

    public abstract void deleteTipoDeUsuario(TipoDeUsuario tipoDeUsuario);

    public abstract List<TipoDeUsuario> getAllTipoDeUsuario();

    public List<TipoDeUsuario> findByNome(String name);
}
