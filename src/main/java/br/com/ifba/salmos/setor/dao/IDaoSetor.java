/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.setor.dao;

import br.com.ifba.salmos.setor.model.Setor;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Everton.
 */
public interface IDaoSetor extends JpaRepository<Setor, Long> {
   public abstract List<Setor> findByNome(String name);
}
