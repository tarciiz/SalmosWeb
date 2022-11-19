package br.com.ifba.salmos.tipodeitem.dao;

import br.com.ifba.salmos.tipodeitem.model.TipoDeItem;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dudasss
 */
public interface IDaoTipoItem extends JpaRepository<TipoDeItem, Long> {

    public abstract List<TipoDeItem> findByNome(String name);
}