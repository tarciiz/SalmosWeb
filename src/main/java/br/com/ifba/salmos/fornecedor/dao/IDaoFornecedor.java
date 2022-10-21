/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.fornecedor.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifba.salmos.fornecedor.model.Fornecedor;

/**
 *
 * @author vitor
 */
public interface IDaoFornecedor extends JpaRepository<Fornecedor, Long>{
    
    public abstract List<Fornecedor> findByName(String name);
}
