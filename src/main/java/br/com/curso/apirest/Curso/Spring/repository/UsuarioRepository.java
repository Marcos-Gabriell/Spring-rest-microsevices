package br.com.curso.apirest.Curso.Spring.repository;

import br.com.curso.apirest.Curso.Spring.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
