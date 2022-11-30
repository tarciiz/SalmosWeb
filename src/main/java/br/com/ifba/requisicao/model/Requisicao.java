/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.requisicao.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.item.model.Item;
import br.com.ifba.pessoa.model.Pessoa;
import br.com.ifba.setor.model.Setor;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.util.List;

/**
 *
 * @author Vitor
 */
@Entity
@Table(name = "requisicao")
@Data
@EqualsAndHashCode(callSuper = false)
public class Requisicao extends PersistenceEntity {
    private String codigoSaida;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa requisitante;

    @ManyToMany
    private List<Item> itens;
}
