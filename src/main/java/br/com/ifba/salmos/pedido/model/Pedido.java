/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.pedido.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.empenho.model.Empenho;
import br.com.ifba.salmos.item.model.Item;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;
import lombok.Data;

/**
 *
 * @author rocki.julius
 */

@Entity
@Table(name = "pedido")
@Data
public class Pedido extends PersistenceEntity {    
    private String notaFiscal;
    private double valorTotal;
    
    @OneToMany(mappedBy = "pedidos")
    private Empenho empenho;
    
    @ManyToMany
    private List<Item> itens;

}