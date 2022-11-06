
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.empenho.model;


import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author rocki.julius
 */

@Entity
@Table(name = "empenho")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Empenho extends PersistenceEntity {
    private String itens;
    private Date validadeEmpenho;
    private float valorEmpenho;
    private String pedido;
    private String notaEmpenho;
}