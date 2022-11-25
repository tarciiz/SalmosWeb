/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.requisicoes.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.item.model.Item;
import br.com.ifba.salmos.setor.model.Setor;
import lombok.Data;
// import java.util.Collection;
// import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
// import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author Vitor
 */
@Entity
@Table(name = "requisicoes")
@Data
public class Requisicoes extends PersistenceEntity {
    
    @OneToOne
    private Setor setor;

    private String usuarioRequisitante;
    private String codSaida;
    private int quantidadeItensReq;


    @ManyToMany
    private Item itemRequisitado;
}
