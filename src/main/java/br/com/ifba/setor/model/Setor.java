/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.setor.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.requisicao.model.Requisicao;
import ch.qos.logback.core.subst.Token.Type;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 *
 * @author Everton.
 */
@Entity // Indicando que essa classe é uma das que vão se tornar persistível no banco de
        // dados.

@Table(name = "setor")
@Data
@EqualsAndHashCode(callSuper = false)
public class Setor extends PersistenceEntity {
    // Atributos
    private String name;
    private String descricao;

    @OneToMany(cascade= CascadeType.ALL, mappedBy = "setor")
    private List<Requisicao> requisicoes;

}
