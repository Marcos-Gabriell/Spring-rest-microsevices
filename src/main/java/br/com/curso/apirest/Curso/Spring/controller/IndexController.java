package br.com.curso.apirest.Curso.Spring.controller;

import br.com.curso.apirest.Curso.Spring.model.Usuario;
import br.com.curso.apirest.Curso.Spring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/usuario")
public class IndexController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Usuario> init(@PathVariable(value = "id") Long id) {

      Optional<Usuario> usuario = usuarioRepository.findById(id);

        return new  ResponseEntity(usuario.get(), HttpStatus.OK);
    }
}