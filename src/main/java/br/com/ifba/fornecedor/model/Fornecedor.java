/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fornecedor.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.item.model.Item;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import java.util.List;

/**
 *
 * @author vitor
 */

@Entity
@Table(name = "fornecedor")
@Data
public class Fornecedor extends PersistenceEntity {
    private String nome;
    private String email;
    private String cnpj;
    private String telefone;

    @ManyToOne
    private List<Item> itens;

}
