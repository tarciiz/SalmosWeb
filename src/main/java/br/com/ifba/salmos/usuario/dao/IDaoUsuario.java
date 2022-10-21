package br.com.ifba.salmos.usuario.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ifba.salmos.usuario.model.Usuario;

public interface IDaoUsuario extends JpaRepository<Usuario, Long>{
    
    public abstract List<Usuario> findByName(String name);


}
