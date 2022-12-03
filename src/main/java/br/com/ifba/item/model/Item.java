/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.item.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.com.ifba.empenho.model.Empenho;
import br.com.ifba.fornecedor.model.Fornecedor;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.pedido.model.Pedido;
import br.com.ifba.requisicao.model.Requisicao;
import br.com.ifba.tipodeitem.model.TipoDeItem;

import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author vitor
 */

@Entity
@Table(name = "item")
@Data
@EqualsAndHashCode(callSuper = false)
public class Item extends PersistenceEntity {
    private String codigoItem;
    private String nome;
    private String descricao;
    private int quantidade;
    private int quantidadeMinima;
    private Date dataValidade;
    private double valorItem;
    private String perecivel;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "tipoDeItem_id")
    private TipoDeItem tipoDeItem;

    @JsonBackReference
    @ManyToMany(mappedBy = "itens")
    private List<Empenho> empenhos;

    @JsonBackReference
    @ManyToMany(mappedBy = "itens")
    private List<Requisicao> requisicoes;

    @JsonBackReference
    @ManyToMany(mappedBy = "itens")
    private List<Pedido> pedidos;

}
