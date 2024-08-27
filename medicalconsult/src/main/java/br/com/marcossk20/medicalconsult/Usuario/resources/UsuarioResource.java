package br.com.marcossk20.medicalconsult.Usuario.resources;

import br.com.marcossk20.medicalconsult.Usuario.domain.Usuario;
import br.com.marcossk20.medicalconsult.Usuario.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
    @Autowired
    private UsuarioService usuarioService;

    public ResponseEntity<Usuario> cadastrasUsuario(@RequestBody Usuario usuario){
       Usuario novoUsuario = usuarioService.cadastrarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
    }
}
