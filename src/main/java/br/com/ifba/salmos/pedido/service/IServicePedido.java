/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.pedido.service;

import br.com.ifba.salmos.pedido.model.Pedido;
import java.util.List;

/**
 *
 * @author rocki.julius
 */
public interface IServicePedido {
    public abstract Pedido savePedido(Pedido pedido);

    public abstract Pedido updatePedido(Pedido pedido);

    public abstract void deletePedido(Pedido pedido);

    public abstract List<Pedido> getAllPedido();
}
