/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.setor.service;

import br.com.ifba.salmos.setor.model.Setor;
import java.util.List;

/**
 *
 * @author Everton.
 */
public interface IServiceSetor {

    public abstract Setor saveSetor(Setor setor);

    public abstract Setor updateSetor(Setor setor);

    public abstract void deleteSetor(Setor setor);

    public abstract List<Setor> getAllSetor();

    public List<Setor> findByNome(String name);
}
