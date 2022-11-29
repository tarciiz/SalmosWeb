package br.com.ifba.tipodeitem.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.item.model.Item;

import java.util.List;

@Entity
@Table(name = "tipoDeItem")
@Data
public class TipoDeItem extends PersistenceEntity {
    private String nome;
    private String descricao;

    @ManyToOne
    private List<Item> itens;
    
}
