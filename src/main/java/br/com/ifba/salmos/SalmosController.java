package br.com.ifba.salmos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.ifba.salmos.fornecedor.model.Fornecedor;
import br.com.ifba.salmos.fornecedor.service.IServiceFornecedor;
import br.com.ifba.salmos.infrastructure.support.StringUtil;
import br.com.ifba.salmos.item.model.Item;
import br.com.ifba.salmos.item.service.IServiceItem;
import br.com.ifba.salmos.requisicoes.service.IServiceRequisicoes;
import br.com.ifba.salmos.setor.model.Setor;
import br.com.ifba.salmos.setor.service.IServiceSetor;
import br.com.ifba.salmos.requisicoes.model.Requisicoes;
import br.com.ifba.salmos.tiposdeusuario.model.TipoDeUsuario;
import br.com.ifba.salmos.tiposdeusuario.service.IServiceTipoDeUsuario;
import br.com.ifba.salmos.usuario.model.Usuario;
import br.com.ifba.salmos.usuario.service.IServiceUsuario;
import br.com.ifba.salmos.tipodeitem.service.IServiceTipoItem;
import br.com.ifba.salmos.tipodeitem.model.tipoDeItem;

@RestController
@RequestMapping(path = "/api/v1/app")
public class SalmosController {
    Gson gson = new Gson();

    @RequestMapping(path = "/hello")
    public String helloWorld(@RequestParam String name) {
        String usuario = "{senha:'" + name + "'}";
        Usuario user = (Usuario) gson.fromJson(usuario, Usuario.class);
        return "Hello " + user.getSenha() + "!";
    }

    // ---------------------------------------------------
    // ------------- USUARIO -----------------------------
    // ---------------------------------------------------
    @Autowired
    private IServiceUsuario serviceUsuario;

    @RequestMapping(path = "/login")
    public Usuario login(String login, String senha) {
        Usuario user = serviceUsuario.findByLoginOrEmailAndSenha(login, login, senha);

        if (user == null) {
            user = serviceUsuario.findByLoginOrEmailAndSenha(login, login, StringUtil.toMD5(senha));
        }

        return user;
    }

    @RequestMapping(path = "/usuarios")
    public List<Usuario> getUsuarios() {
        return serviceUsuario.getAllUsuarios();
    }

    @RequestMapping(path = "/usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        System.out.println("Id " + id);
        return (Usuario) this.serviceUsuario.findById(id);
    }

    @RequestMapping(path = "/salvarUsuario", method = RequestMethod.POST)
    public Usuario salvarUsuario(@RequestBody String usuario) {
        Usuario user = (Usuario) gson.fromJson(usuario, Usuario.class);
        return serviceUsuario.saveUsuario(user);
    }

    @RequestMapping(path = "/atualizarUsuario", method = RequestMethod.POST)
    public Usuario atualizarUsuario(@RequestBody String usuario) {
        Usuario user = (Usuario) gson.fromJson(usuario, Usuario.class);
        if (user.getId() == null)
            return null;
        return serviceUsuario.saveUsuario(user);
    }

    @RequestMapping(path = "/deletarUsuario", method = RequestMethod.GET)
    public boolean deletarUsuario(Long id) {
        Usuario user = new Usuario();
        user.setId(id);
        serviceUsuario.deleteUsuario(user);
        return true;
    }

    // ---------------------------------------------------
    // ------------- TIPO USUARIO -----------------------------
    // ---------------------------------------------------

    @Autowired
    private IServiceTipoDeUsuario serviceTipoUsuario;

    @RequestMapping(path = "/tipodeusuario")
    public List<TipoDeUsuario> salvarTipoDeUsuario() {
        return (List<TipoDeUsuario>) serviceTipoUsuario.getAllTipoDeUsuario();
    }

    @RequestMapping(path = "/salvarTipoDeUsuario", method = RequestMethod.POST)
    public TipoDeUsuario salvarTipoDeUsuario(@RequestBody String tipodeusuario) {
        TipoDeUsuario tusuario = (TipoDeUsuario) gson.fromJson(tipodeusuario, TipoDeUsuario.class);
        return serviceTipoUsuario.saveTipoDeUsuario(tusuario);
    }

    @RequestMapping(path = "deletarTipoDeUsuario", method = RequestMethod.GET) // Criando o link para usar no frontend
    public boolean deletarTipoDeUsuario(Long id) {// Criando fução de excluir
        TipoDeUsuario tusuario = new TipoDeUsuario();// criando um objeto instanciado do tipo de objeto
        tusuario.setId(id);// pegando o id passado por parâmetro e passando para o objeto
        serviceTipoUsuario.deleteTipoDeUsuario(tusuario);// Chamando a função de deletar Tipo de usuário do service e
    // passando o objeto com o id do objeto que quero excluir.
        return true;
    }

<<<<<<< HEAD


// ---------------------------------------------------
// ------------- TIPO DE ITEM -----------------------------
// ---------------------------------------------------

@Autowired
private IServiceTipoItem serviceTipoItem;

@RequestMapping(path = "/tiposDeItem")
public List<tipoDeItem> gettTipoDeItem() {
    return serviceTipoItem.getAlltipoDeItem();
=======
    // ---------------------------------------------------
    // ------------- Requisições -----------------------------
    // ---------------------------------------------------

    @Autowired
    private IServiceRequisicoes serviceRequisicoes;

    @RequestMapping(path = "/requisicao")
    public List<Requisicoes> salvarRequisicoes() {
        return (List<Requisicoes>) serviceRequisicoes.getAllRequisicoes();
    }

    @RequestMapping(path = "/salvarRequisicoes", method = RequestMethod.POST)
    public Requisicoes salvarRequisicoes(@RequestBody String requisicoes) {
        Requisicoes requisicoess = (Requisicoes) gson.fromJson(requisicoes, Requisicoes.class);
        return serviceRequisicoes.saveRequisicoes(requisicoess);
    }

    @RequestMapping(path = "/deletarRequisicoes", method = RequestMethod.GET) 
    public boolean deletarRequisicoes(Long id) {
        Requisicoes requisicoess = new Requisicoes();
        requisicoess.setId(id);
        serviceRequisicoes.deleteRequisicoes(requisicoess);
        return true;
    }

    // ---------------------------------------------------
    // ------------- Item -----------------------------
    // ---------------------------------------------------

    @Autowired
    private IServiceItem serviceItem;

    @RequestMapping(path = "/Item")
    public List<Item> salvarItem() {
        return (List<Item>) serviceItem.getAllItens();
    }
    
    @RequestMapping(path = "/salvarItem", method = RequestMethod.POST)
    public Item salvarItem(@RequestBody String itemm) {
        Item item = (Item) gson.fromJson(itemm, Item.class);
        return serviceItem.saveItem(item);
    }
    
    @RequestMapping(path = "/atualizarItem", method = RequestMethod.POST)
    public Item atualizarItem(@RequestBody String item) {
        Item itemm = (Item) gson.fromJson(item, Item.class);
        if (itemm.getId() == null)
            return null;
        return serviceItem.saveItem(itemm);
    }

    @RequestMapping(path = "deletarItem", method = RequestMethod.GET) // Criando o link para usar no frontend
    public boolean deletarItem(Long id) {// Criando fução de excluir
        Item item = new Item();// criando um objeto instanciado do tipo de objeto
        item.setId(id);// pegando o id passado por parâmetro e passando para o objeto
        serviceItem.deleteItem(item);// Chamando a função de deletar Tipo de usuário do service e
        // passando o objeto com o id do objeto que quero excluir.
        return true;
    }



    // ---------------------------------------------------
    // ------------- Fornecedor -----------------------------
    // ---------------------------------------------------

    @Autowired
    private IServiceFornecedor serviceFornecedor;

    @RequestMapping(path = "/fornecedor")
    public List<Fornecedor> salvarFornecedor() {
        return (List<Fornecedor>) serviceFornecedor.getAllFornecedor();
    }

    // ---------------------------------------------------
    // ------------- Fornecedor -----------------------------
    // ---------------------------------------------------

    @Autowired
    private IServiceSetor serviceSetor;

    @RequestMapping(path = "/setor")
    public List<Setor> salvarSetor() {
        return (List<Setor>) serviceSetor.getAllSetor();
    }
>>>>>>> 1e33c0e6ef18867bba0e3007382cc851332a324e
}

@RequestMapping(path = "/salvarTipoItem", method = RequestMethod.POST)
    public tipoDeItem salvarTipoDeItem(@RequestBody String tipodeitem) {
        tipoDeItem tipo = (tipoDeItem) gson.fromJson(tipodeitem, tipoDeItem.class);
        return serviceTipoItem.savetipoDeItem(tipo);
    }

    @RequestMapping(path = "/atualizarTipoItem", method = RequestMethod.POST)
    public tipoDeItem atualizarTipoDeItem(@RequestBody String tipodeitem) {
        tipoDeItem tipo = (tipoDeItem) gson.fromJson(tipodeitem, tipoDeItem.class);
        if (tipo.getId() == null)
            return null;
        return serviceTipoItem.savetipoDeItem(tipo);
    }

    @RequestMapping(path = "/deletarTipoItem", method = RequestMethod.GET)
    public boolean deletarTipoDeItem(Long id) {
        tipoDeItem tipo = new tipoDeItem();
        tipo.setId(id);
        serviceTipoItem.deletetipoDeItem(tipo);
        return true;
    }
}