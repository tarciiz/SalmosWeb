/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.requisicao.dao;

import br.com.ifba.salmos.requisicao.model.Requisicao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Igor Lopes
 */
public interface IDaoRequisicao extends JpaRepository<Requisicao, Long>{
     public List<Requisicao> findByName(String name);
}
