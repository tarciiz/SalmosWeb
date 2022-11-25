
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.empenho.model;


import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.item.model.Item;
import br.com.ifba.salmos.pedido.model.Pedido;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author rocki.julius
 */

@Entity
@Table(name = "empenho")
@Data

public class Empenho extends PersistenceEntity {    
    private String validade;
    private String nota;
    private float valor;

    @OneToMany
    private Pedido pedido;
    
    @ManyToOne
    private Item itens;    
}