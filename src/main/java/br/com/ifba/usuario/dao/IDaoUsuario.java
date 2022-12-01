package br.com.ifba.usuario.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifba.usuario.model.Usuario;

@Repository
public interface IDaoUsuario extends JpaRepository<Usuario, Long> {

    public abstract List<Usuario> findByNome(String name);

    public abstract Optional<Usuario> findById(Long id);

    //public abstract Optional<Usuario> findByLoginOrEmailAndSenha(String login, String senha);
}
