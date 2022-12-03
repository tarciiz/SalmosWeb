
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.notification.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

/**
 *
 * @author tarciiz
 */

@Entity
@Table(name = "notification")
@Data
public class Notification extends PersistenceEntity {
    String title;
    String body;

    // List<Usuario> recivers;

    String urlFor;

    boolean readed = false;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    LocalDateTime sendDateTime;
}