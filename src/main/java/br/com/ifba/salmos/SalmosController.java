package br.com.ifba.salmos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import br.com.ifba.salmos.tiposdeusuarios.service.IServiceTipoDeUsuario;
import br.com.ifba.salmos.usuario.model.Usuario;
import br.com.ifba.salmos.usuario.service.IServiceUsuario;

@RestController
@RequestMapping(path = "/api/v1/app")
public class SalmosController {
    Gson gson = new Gson();

    

    @RequestMapping(path = "/hello")
    public String helloWorld(@RequestParam String name) {
        return "Hello " + name + "!";
    }

    // ---------------------------------------------------
    // ------------- USUARIO -----------------------------
    // ---------------------------------------------------
    @Autowired
    private IServiceUsuario serviceUsuario;

    @RequestMapping(path = "/login")
    public Usuario login(String login, String senha) {
        for (Usuario usr : serviceUsuario.getAllUsuarios()) {
            if (login.equals(usr.getLogin()) && senha.equals(usr.getSenha())) {
                return usr;
            }
        }
        return null;
    }

    @RequestMapping(path = "/usuarios")
    public List<Usuario> getUsuarios() {
        return serviceUsuario.getAllUsuarios();
    }


    @RequestMapping(path = "/salvarUsuario", method = RequestMethod.POST)
    public Usuario salvarUsuario(@RequestBody String usuario) {
        Usuario user = (Usuario) gson.fromJson(usuario, Usuario.class);
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

    @RequestMapping(path = "/salvarTipoDeUsuario", method = RequestMethod.POST)
    public TipoDeUsuario salvarTipoDeUsuario(@RequestBody String tipodeusuario){
        TipoDeUsuario tusuario = (TipoDeUsuario) gson.fromJson(tipodeusuario,  TipoDeUsuario.class);
        return serviceTipoUsuario.saveTipoDeUsuario(tusuario);
    }



}
