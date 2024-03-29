package br.com.ifba.professor.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifba.professor.model.Professor;

public interface IDaoProfessor extends JpaRepository<Professor, Long>{
    public List<Professor> findByNome(String nome);
    public boolean existsByNome(String nome);
}
