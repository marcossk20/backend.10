package br.com.marcossk20.medicalconsult.Usuario.repositories;

import br.com.marcossk20.medicalconsult.Usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
