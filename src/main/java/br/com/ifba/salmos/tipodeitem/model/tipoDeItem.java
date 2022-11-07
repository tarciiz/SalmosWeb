package br.com.ifba.salmos.tipodeitem.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.item.model.Item;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tipoDeItem")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class tipoDeItem extends PersistenceEntity {
    private String tipoItem;
    private String descricao;

    // @ManyToOne
    // private List<Item> listaItens;
}
