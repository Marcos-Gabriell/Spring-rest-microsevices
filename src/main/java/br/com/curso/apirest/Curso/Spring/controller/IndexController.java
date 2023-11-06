package br.com.curso.apirest.Curso.Spring.controller;

import br.com.curso.apirest.Curso.Spring.model.Usuario;
import br.com.curso.apirest.Curso.Spring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/usuario")
public class IndexController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<Usuario> init() {

        Usuario usuario = new Usuario();
        usuario.setId(50L);
        usuario.setLogin("marcos@gmail.com");
        usuario.setNome("Marcos");
        usuario.setSenha("12345");

        Usuario usuario2 = new Usuario();
        usuario2.setId(10L);
        usuario2.setLogin("gabriel@gmail.com");
        usuario2.setNome("gabriel");
        usuario2.setSenha("5136");



        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario);
        usuarios.add(usuario2);

        return new  ResponseEntity(usuarios, HttpStatus.OK);
    }
}