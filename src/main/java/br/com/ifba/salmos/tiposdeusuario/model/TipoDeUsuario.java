/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.tiposdeusuario.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import javax.persistence.Entity;
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

    private String descricao;
    private int nivelAcesso;

}
