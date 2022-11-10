/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.requisicoes.dao;

// import br.com.ifba.salmos.requisicao.model.Requisicao;
import br.com.ifba.salmos.requisicoes.model.Requisicoes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Vitor
 */
public interface IDaoRequisicoes extends JpaRepository<Requisicoes, Long> {
     public List<Requisicoes> findByNome(String name);
}
