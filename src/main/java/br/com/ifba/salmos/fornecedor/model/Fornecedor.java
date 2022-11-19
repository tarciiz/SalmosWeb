/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.fornecedor.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author vitor
 */

@Entity
@Table(name = "fornecedor")
@Data
public class Fornecedor extends PersistenceEntity {
    private String email;
    private String telefone;
    private String cnpj;
    private String nomee;
}
