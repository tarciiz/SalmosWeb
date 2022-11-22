package br.com.ifba.salmos.tipodeitem.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tipoDeItem")
@Data
public class TipoDeItem extends PersistenceEntity {
    private String tipoItem;
    private String descricao;

    // @ManyToOne
    // private List<Item> listaItens;
    
}
