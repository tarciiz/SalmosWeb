/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.tiposdeusuarios.dao;

import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Igor Lopes e Eduarda
 */
public interface IDaoTipoDeUsuario extends JpaRepository<TipoDeUsuario, Long> {
   public abstract List<TipoDeUsuario> findByName(String name);
}