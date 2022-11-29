/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.tiposdeusuario.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifba.tiposdeusuario.model.TipoDeUsuario;

/**
 *
 * @author Igor Lopes e Eduarda
 */
public interface IDaoTipoDeUsuario extends JpaRepository<TipoDeUsuario, Long> {
   public abstract List<TipoDeUsuario> findByNome(String name);
}