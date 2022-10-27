/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.item.dao;

import br.com.ifba.salmos.item.model.Item;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vitor
 */
public interface IDaoItem extends JpaRepository<Item, Long> {

    public abstract List<Item> findByNome(String name);
}
