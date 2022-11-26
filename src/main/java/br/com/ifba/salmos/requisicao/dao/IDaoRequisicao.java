/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.requisicao.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifba.salmos.requisicao.model.Requisicao;

/**
 *
 * @author Vitor
 */
public interface IDaoRequisicao extends JpaRepository<Requisicao, Long> {
     public List<Requisicao> findByNome(String name);
}
