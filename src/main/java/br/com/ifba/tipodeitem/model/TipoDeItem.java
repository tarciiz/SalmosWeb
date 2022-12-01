package br.com.ifba.tipodeitem.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.item.model.Item;

import java.util.List;

@Entity
@Table(name = "tipoDeItem")
@Data
@EqualsAndHashCode(callSuper = false)
public class TipoDeItem extends PersistenceEntity {
    private String name;
    private String descricao;

    @OneToMany(mappedBy = "tipoDeItem")
    private List<Item> itens;
    
}
