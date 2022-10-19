package br.com.ifba.salmos;

import java.util.List;

import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import br.com.ifba.salmos.usuario.model.Usuario;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping(path = "/api/v1/app")
public class SalmosController {
    Gson gson = new Gson();

    @RequestMapping(path = "/hello")
    public String helloWorld(@RequestParam String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(path = "/login")
    public Usuario login(String login, String senha) {
        for (Usuario usr : FacadeInstance.getInstance().getAllUsuarios()) {
            if (login.equals(usr.getLogin()) && senha.equals(usr.getSenha())) {
                return usr;
            }
        }
        return null;
    }

    @RequestMapping(path = "/usuarios")
    public List<Usuario> getUsuarios() {
        return FacadeInstance.getInstance().getAllUsuarios();
    }

    @RequestMapping(path = "/tipodeusuarios")
    public List<TipoDeUsuario> getTipoDeUsuarios() {
        return FacadeInstance.getInstance().getAllTipoDeUsuarios();
    }

    @RequestMapping(path = "/salvarUsuario", method = RequestMethod.POST)
    public Usuario salvarUsuario(@RequestBody String usuario) {
        Usuario user = (Usuario) gson.fromJson(usuario, Usuario.class);
        return FacadeInstance.getInstance().saveUsuario(user);
    }

    @RequestMapping(path = "/deletarUsuario", method = RequestMethod.GET)
    public boolean deletarUsuario(Long id) {
        Usuario user = new Usuario();
        user.setId(id);
        FacadeInstance.getInstance().deleteUsuario(user);
        return true;
    }
}
