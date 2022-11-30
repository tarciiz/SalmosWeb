/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.perfilUsuario.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.usuario.model.Usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Igor Lopes
 *         editted by tarciiz
 */
@Entity
@Table(name = "perfilusuario")
@Data
@EqualsAndHashCode(callSuper = false)
public class PerfilUsuario extends PersistenceEntity {
    private String nome;
    private String descricao;
    
    @OneToMany(mappedBy = "perfil")
    private List<Usuario> usuarios;
}
