/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.usuario.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.tiposdeusuario.model.TipoDeUsuario;

/**
 *
 * @author vitor
 */

@Entity
@Table(name = "usuario")
public class Usuario extends PersistenceEntity {

    @OneToOne
    private TipoDeUsuario tipodeusuario;

    /*
     * @OneToOne(cascade = CascadeType.ALL)
     * private TipoDeUsuario tipodeusuarios;
     */

    private String login;
    private String senha;
    private String email;

    public Usuario() {
    }

    public Usuario(String login, String senha, String email, String nome) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.setNome(nome);
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

    public TipoDeUsuario getTipodeusuario() {
        return tipodeusuario;
    }

    public void setTipodeusuario(TipoDeUsuario tipodeusuario) {
        this.tipodeusuario = tipodeusuario;
    }

}
