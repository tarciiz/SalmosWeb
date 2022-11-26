/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.requisicoes.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.item.model.Item;
import br.com.ifba.salmos.setor.model.Setor;
import br.com.ifba.salmos.pessoa.model.Pessoa;

import lombok.Data;
// import java.util.Collection;
// import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 *
 * @author Vitor
 */
@Entity
@Table(name = "requisicao")
@Data
public class Requisicoes extends PersistenceEntity {
    private String codigoSaida;
    private boolean status;

    @OneToMany(mappedBy = "requisicoes")
    private Setor setor;

    @ManyToMany
    private List<Item> itens;

    @OneToMany(mappedBy = "requisicoes")
    private Pessoa requisitante;

}
