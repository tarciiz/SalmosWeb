/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.item.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

//import org.hibernate.annotations.ManyToAny;

import br.com.ifba.salmos.empenho.model.Empenho;
import br.com.ifba.salmos.fornecedor.model.Fornecedor;
import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.pedido.model.Pedido;
import br.com.ifba.salmos.requisicao.model.Requisicao;
import br.com.ifba.salmos.tipodeitem.model.TipoDeItem;

import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 *
 * @author vitor
 */

@Entity
@Table(name = "item")
@Data
public class Item extends PersistenceEntity {
    private String codigoItem;
    private String nome;
    private String descricao;
    private int quantidade;
    private int quantidadeMinima;    
    private Date dataValidade;
    private double valorItem;
    private boolean perecivel;
    
    @OneToMany(mappedBy = "itens")
    private Fornecedor fornecedor;

    @OneToMany(mappedBy = "itens")
    private TipoDeItem tipoItem;

    @ManyToMany(mappedBy = "itens")
    private List<Empenho> empenhos;

    @ManyToMany(mappedBy = "itens")
    private List<Requisicao> requisicoes;

    @ManyToMany(mappedBy = "itens")
    private List<Pedido> pedidos;

}
