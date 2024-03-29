package br.com.ifba.tecnicoAdministrativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.tecnicoAdministrativo.dao.IDaoTecnicoAdministrativo;
import br.com.ifba.tecnicoAdministrativo.model.TecnicoAdministrativo;

@Service
public class ServiceTecnicoAdministrativo implements IServiceTecnicoAdministrativo{
    //================= CONSTANTES =============================================
    
    // Mensagem de erro se o Tecnico Administrativo for null.
    public final static String TECNICO_ADM_NULL = "Dados do Tecnico Administrativo nao preenchidos";
    
    // Mensagem de erro se o Tecnico Administrativo já existe.
    public final static String TECNICO_ADM_EXISTE = "Tecnico Administrativo ja existente no Banco de dados";
    
    // Mensagem de erro se o Tecnico Administrativo não existir no banco.
    public final static String TECNICO_ADM_NAO_EXISTE = "Tecnico Administrativo nao existente no Banco de dados";
    
    // Mensagem de erro se o Tecnico Administrativo for inválido.
    public final static String TECNICO_ADM_INVALIDO = "As informaçoes do Tecnico Administrativo nao sao validas";
    
     // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    
   
     //================= OBJETO =================================================
    @Autowired
    private IDaoTecnicoAdministrativo tecnicoAdministrativoDao;

     //================= MÉTODOS ================================================
    @Override
    public TecnicoAdministrativo saveTecnicoAdministrativo(TecnicoAdministrativo tecnicoAdministrativo) {
       if(tecnicoAdministrativo == null) {
            throw new BusinessException(TECNICO_ADM_NULL);
        } 
       if(tecnicoAdministrativoDao.existsByNome(tecnicoAdministrativo.getNome()) == true) {
            throw new BusinessException(TECNICO_ADM_EXISTE);
        }
       return tecnicoAdministrativoDao.save(tecnicoAdministrativo);
    }

    @Override
    public TecnicoAdministrativo updateTecincoAdministrativo(TecnicoAdministrativo tecnicoAdministrativo) {
        if(tecnicoAdministrativo == null) {
            throw new BusinessException(TECNICO_ADM_NULL);
        }
        if(tecnicoAdministrativoDao.existsById(tecnicoAdministrativo.getId()) == false) {
            throw new BusinessException(TECNICO_ADM_NAO_EXISTE);
        }
        return tecnicoAdministrativoDao.save(tecnicoAdministrativo);
    }

    @Override
    public void deleteTecnicoAdministrativo(TecnicoAdministrativo tecnicoAdministrativo) {
        if(tecnicoAdministrativo == null) {
            throw new BusinessException(TECNICO_ADM_NULL);
        }
        if(tecnicoAdministrativoDao.existsById(tecnicoAdministrativo.getId()) == false) {
            throw new BusinessException(TECNICO_ADM_NAO_EXISTE);
        }
        tecnicoAdministrativoDao.delete(tecnicoAdministrativo);
    }

    @Override
    public List<TecnicoAdministrativo> getAllTecnicoAdministrativo() {
        return this.tecnicoAdministrativoDao.findAll();
    }
    
    @Override
    public List<TecnicoAdministrativo> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        }
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return tecnicoAdministrativoDao.findByNome(nome);
    }
    
     @Override
     public TecnicoAdministrativo findById(Long id) {
          return tecnicoAdministrativoDao.getReferenceById(id);
     }
}
