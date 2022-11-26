/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.tiposdeusuario.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.usuario.model.Usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Igor Lopes
 *         editted by tarciiz
 */
@Entity
@Table(name = "tipodeusuario")
@Data
public class TipoDeUsuario extends PersistenceEntity {
    private String nome;
    private String descricao;
    
    @ManyToOne
    private List<Usuario> usuarios;
}
