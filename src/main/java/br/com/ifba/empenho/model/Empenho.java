
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.empenho.model;


import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.item.model.Item;
import br.com.ifba.pedido.model.Pedido;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author rocki.julius
 */

@Entity
@Table(name = "empenho")
@Data
@EqualsAndHashCode(callSuper = false)
public class Empenho extends PersistenceEntity {    
    private Date validade;
    private String nota;
    private float valor;

    @OneToMany(mappedBy = "empenho")
    private List<Pedido> pedidos;
    
    @ManyToMany
    private List<Item> itens; 

}