/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.item.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.ifba.salmos.fornecedor.model.Fornecedor;
import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.tipodeitem.model.TipoDeItem;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author vitor
 */

@Entity
@Table(name = "item")
@Data
public class Item extends PersistenceEntity {

    private int codItem;
    private String nomeItem;
    private String Descricao;
    private int quantidade;
    private int quantidadeMinima;
    @OneToOne
    private Fornecedor fornecedor;
    private Date dataValidade;
    private float valorItem;
    private boolean isPerecivel;
    @OneToOne
    private TipoDeItem tipoItem;


}
