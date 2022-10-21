/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.item.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.requisicao.model.Requisicao;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author vitor
 */

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Item extends PersistenceEntity{

    @ManyToMany(mappedBy = "itensRequisitados") //adicionado pra salvar requisição no banco
    private List<Requisicao> requisicoes;   // fazendo os testes ainda, uma requisição de vários itens e um item pode estar em várias requisições
    
    private String nome;
    private String Descricao;
    private int quantidade;
    private String fornecedor;
    
}
