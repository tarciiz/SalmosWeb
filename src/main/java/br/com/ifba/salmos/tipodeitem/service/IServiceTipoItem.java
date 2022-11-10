package br.com.ifba.salmos.tipodeitem.service;

import java.util.List;

import br.com.ifba.salmos.tipodeitem.model.tipoDeItem;


public interface IServiceTipoItem {

    public abstract tipoDeItem savetipoDeItem(tipoDeItem tipoDeItem);

    public abstract tipoDeItem updatetipoDeItem(tipoDeItem tipoDeItem);

    public abstract void deletetipoDeItem(tipoDeItem tipoDeItem);

    public abstract List<tipoDeItem> getAlltipoDeItem();
}
