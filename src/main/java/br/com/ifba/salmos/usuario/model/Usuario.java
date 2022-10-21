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

/**
 *
 * @author vitor
 */

@Entity
@Table
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

    public Usuario() {
    }

    public Usuario(String login, String senha, String email, String nome, String tipodeusuario) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.tipodeusuario = tipodeusuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipodeusuario() {
        return tipodeusuario;
    }

    public void setTipodeusuario(String tipodeusuario) {
        this.tipodeusuario = tipodeusuario;
    }

    public TipoDeUsuario getTipodeusuarios() {
        return tipodeusuarios;
    }

    public void setTipodeusuarios(TipoDeUsuario tipodeusuarios) {
        this.tipodeusuarios = tipodeusuarios;
    }

}
