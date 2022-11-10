/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.requisicoes.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
// import br.com.ifba.salmos.item.model.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// import java.util.Collection;
// import javax.persistence.CascadeType;
import javax.persistence.Entity;
// import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Vitor
 */
@Entity
@Table(name = "requisicoes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Requisicoes extends PersistenceEntity {
    private String setor;
    private String usuarioRequisitante;
    private String itemRequisitado;
    private int quantidadeItensReq;
}
