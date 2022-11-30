/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.pessoa.model.Pessoa;
import br.com.ifba.perfilUsuario.model.PerfilUsuario;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author vitor
 */

@Entity
@Table(name = "usuario")
@Data
@EqualsAndHashCode(callSuper = false)
public class Usuario extends PersistenceEntity {
    private String login;
    private String senha;
    private String email;

    @OneToOne(mappedBy = "usuario")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "perfilUsuario_id")
    private PerfilUsuario perfil;
}

