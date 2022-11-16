/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.item.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.tipodeitem.model.tipoDeItem;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author vitor
 */

@Entity
@Table(name = "item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Item extends PersistenceEntity {

    private int codItem;
    private String nomeItem;
    private String Descricao;
    private int quantidade;
    private int quantidadeMinima;
    private String fornecedor;
    private Date dataValidade;
    private float valorItem;
    private boolean isPerecivel;
    @OneToOne
    private tipoDeItem tipoItem;


    @OneToOne
    private Item item;

}
