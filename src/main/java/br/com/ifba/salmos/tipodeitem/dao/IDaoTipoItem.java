package br.com.ifba.salmos.tipodeitem.dao;

import br.com.ifba.salmos.tipodeitem.model.tipoDeItem;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dudasss
 */
public interface IDaoTipoItem extends JpaRepository<tipoDeItem, Long> {

    public abstract List<tipoDeItem> findByNome(String name);
}