package br.com.ifba.tipoTurma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.tipoTurma.dao.IDaoTipoTurma;
import br.com.ifba.tipoTurma.model.TipoTurma;

@Service
public class ServiceTipoTurma implements IServiceTipoTurma{
    private final static String TIPOTURMA_NULL = "Dados do Tipo da Turma nao preenchidos";
    // Mensagem de erro se o TipoTurma jÃ¡ existir.
    private final static String TIPOTURMA_EXISTE = "Tipo da Turma ja existente no Banco de dados";
    // Mensagem de erro se a TipoTurma nÃ£o existir no banco.
    private final static String TIPOTURMA_NAO_EXISTE = "Tipo da Turma nao existente no Banco de dados";
    // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    
     //================= OBJETO =================================================
    @Autowired
    private IDaoTipoTurma tipoturmaDao;

     //================= MÃ‰TODOS ================================================
    @Override
    public TipoTurma saveTipoTurma(TipoTurma tipoturma) {
       if(tipoturma == null){
            throw new BusinessException(TIPOTURMA_NULL);
        }
       if(tipoturmaDao.existsByNome(tipoturma.getNome()) == true) {
            throw new BusinessException(TIPOTURMA_EXISTE);
        }
       return this.tipoturmaDao.save(tipoturma);
    }

    @Override
    public TipoTurma updateTipoTurma(TipoTurma tipoturma) {
        if(tipoturma == null){
            throw new BusinessException(TIPOTURMA_NULL);
        } 
        if(tipoturmaDao.existsById(tipoturma.getId()) == false) {
            throw new BusinessException(TIPOTURMA_NAO_EXISTE);
        }
        return this.tipoturmaDao.save(tipoturma);        
    }

    @Override
    public void deleteTipoTurma(TipoTurma tipoturma) {
        if(tipoturma == null){
            throw new BusinessException(TIPOTURMA_NULL);
        } 
        if(tipoturmaDao.existsById(tipoturma.getId()) == false) {
            throw new BusinessException(TIPOTURMA_NAO_EXISTE);
        }
        this.tipoturmaDao.delete(tipoturma);
    }

    @Override
    public List<TipoTurma> getAllTipoTurma() {
        return this.tipoturmaDao.findAll();
    }
    
    @Override
    public List<TipoTurma> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } 
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return this.tipoturmaDao.findByNome(nome);
    }
    
     @Override
     public TipoTurma findById(Long id) {
          return this.tipoturmaDao.getReferenceById(id);
     }
     
}
