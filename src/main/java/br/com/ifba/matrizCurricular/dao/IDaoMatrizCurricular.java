package br.com.ifba.matrizCurricular.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifba.matrizCurricular.model.MatrizCurricular;

@Repository
public interface IDaoMatrizCurricular extends JpaRepository<MatrizCurricular, Long>{
    public List<MatrizCurricular> findByNome(String nome);
    public boolean existsByNome(String nome);
}
