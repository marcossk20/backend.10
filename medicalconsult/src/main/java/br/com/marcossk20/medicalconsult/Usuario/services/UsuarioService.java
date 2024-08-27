package br.com.marcossk20.medicalconsult.Usuario.services;

import br.com.marcossk20.medicalconsult.Usuario.domain.Usuario;
import br.com.marcossk20.medicalconsult.Usuario.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);

    }
}
