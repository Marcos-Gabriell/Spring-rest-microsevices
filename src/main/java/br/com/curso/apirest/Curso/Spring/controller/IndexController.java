package br.com.curso.apirest.Curso.Spring.controller;

import br.com.curso.apirest.Curso.Spring.model.Usuario;
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

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<Usuario> init() {


        Usuario usuario = new Usuario();

        usuario.setId(50L);
        usuario.setLogin("marcos@gmail.com");
        usuario.setNome("Marcos");
        usuario.setSenha("12345");

        usuario.setId(10L);
        usuario.setLogin("gabriel@gmail.com");
        usuario.setNome("gabriel");
        usuario.setSenha("5136");

        List<Usuario> usuarios = new ArrayList<>()
        return new  ResponseEntity(usuarios);
    }
}