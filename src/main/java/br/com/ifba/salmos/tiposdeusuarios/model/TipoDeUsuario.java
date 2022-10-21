/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.tiposdeusuarios.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 *
 * @author Igor Lopes
 */
@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class TipoDeUsuario extends PersistenceEntity{
    
    @OneToMany(mappedBy = "tipodeusuarios")
    private List<Usuario> usuarios;
    
    private String nome;
    private String descricao;

}


