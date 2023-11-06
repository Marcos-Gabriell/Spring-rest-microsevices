package br.com.curso.apirest.Curso.Spring.controller;

import br.com.curso.apirest.Curso.Spring.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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

        return  ResponseEntity.ok(usuario);
    }
}