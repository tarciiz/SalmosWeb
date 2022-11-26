/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.setor.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.requisicao.model.Requisicao;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import java.util.List;


/**
 *
 * @author Everton.
 */
@Entity // Indicando que essa classe é uma das que vão se tornar persistível no banco de
        // dados.

@Table(name = "setor")
@Data

public class Setor extends PersistenceEntity {
    // Atributos
    private String nome;
    private String descricao;

    @ManyToOne
    private List<Requisicao> requisicoes;

}
