/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.empenho.service;

import br.com.ifba.salmos.empenho.model.Empenho;
import java.util.List;

/**
 *
 * @author rocki.julius
 */
public interface IServiceEmpenho {
    public abstract Empenho saveEmpenho(Empenho empenho);

    public abstract Empenho updateEmpenho(Empenho empenho);

    public abstract void deleteEmpenho(Empenho empenho);

    public abstract List<Empenho> getAllEmpenho();

}
