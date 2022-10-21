/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.usuario.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
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

public class Usuario extends PersistenceEntity {

    @ManyToOne
    @JoinColumn(name = "TipoDeUsuario_ID", referencedColumnName = "ID")
    private TipoDeUsuario tipodeusuarios;

    /*
     * @OneToOne(cascade = CascadeType.ALL)
     * private TipoDeUsuario tipodeusuarios;
     */

    private String login;
    private String senha;
    private String email;
    private String nome;
    private String tipodeusuario;

}
