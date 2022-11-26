/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.requisicoes.service;

import java.util.List;

import br.com.ifba.salmos.infrastructure.exception.BusinessException;
import br.com.ifba.salmos.requisicoes.dao.IDaoRequisicoes;
import br.com.ifba.salmos.requisicoes.model.Requisicoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vitor
 */
@Service
public class ServiceRequisicoes implements IServiceRequisicoes {

    // CONSTANTES

    // mensagem de erro se a requisição for null;
    public final static String REQUISICAO_NULL = "Requisição null";

    // mensagem de erro se a Requisição já existir;
    public final static String REQUISICAO_EXISTE = "Requisição já existe,";

    // mensagem de erro se a Requisição não existir no banco;
    public final static String REQUISICAO_NAO_EXISTE = "Requisição não existe na base de dados";

    // mensagem de erro se a Requisição for inválido;
    public final static String REQUISICAO_INVALIDO = "Requisição inválida";

    // OBJETO
    @Autowired
    private IDaoRequisicoes daoRequisicoes;

    @Override
    public Requisicoes saveRequisicoes(Requisicoes requisicoes) {
        if (requisicoes == null) {
            throw new BusinessException(REQUISICAO_NULL);
        } else {
            return daoRequisicoes.save(requisicoes);
        }
    }

    @Override
    public Requisicoes updateRequisicoes(Requisicoes requisicoes) {
        if (requisicoes == null) {
            throw new BusinessException(REQUISICAO_NULL);
        } else if (daoRequisicoes.findById(requisicoes.getId()) == null) {
            throw new BusinessException(REQUISICAO_NAO_EXISTE);
        } else {
            return daoRequisicoes.save(requisicoes);
        }
    }

    @Override
    public void deleteRequisicoes(Requisicoes requisicoes) {
        if (requisicoes == null) {
            throw new BusinessException(REQUISICAO_NULL);
        } else {
            this.daoRequisicoes.delete(requisicoes);
            return;
        }

    }

    @Override
    public List<Requisicoes> getAllRequisicoes() {
        return this.daoRequisicoes.findAll();
    }

}
