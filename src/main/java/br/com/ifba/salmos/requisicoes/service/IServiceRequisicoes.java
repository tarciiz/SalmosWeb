/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.requisicoes.service;

// import br.com.ifba.salmos.requisicao.model.Requisicao;
import br.com.ifba.salmos.requisicoes.model.Requisicoes;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 *
 * @author Vitor
 */
@Service
public interface IServiceRequisicoes {
    public abstract Requisicoes saveRequisicoes(Requisicoes requisicoes);

    public abstract Requisicoes updateRequisicoes(Requisicoes requisicoes);

    public abstract void deleteRequisicoes(Requisicoes requisicoes);

    public abstract List<Requisicoes> getAllRequisicoes();
}
