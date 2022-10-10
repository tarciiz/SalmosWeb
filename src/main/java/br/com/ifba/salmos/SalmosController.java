package br.com.ifba.salmos;

import java.util.List;

import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.usuario.model.Usuario;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/app")
public class SalmosController {

    @RequestMapping(path = "/hello")
    public String helloWorld(@RequestParam String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(path = "/usuarios")
    public List<Usuario> getUsuarios() {
        return FacadeInstance.getInstance().getAllUsuarios();
    }

    @RequestMapping(path = "/object", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Usuario test(@RequestBody Usuario obj) {
        return obj;
    }
}
