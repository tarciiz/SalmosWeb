
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.pessoa.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import lombok.Data;

/**
 *
 * @author matheus
 */

@Entity
@Table(name = "pessoa")
@Data

public class Pessoa extends PersistenceEntity {


    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String dataDeNascimento;
}


