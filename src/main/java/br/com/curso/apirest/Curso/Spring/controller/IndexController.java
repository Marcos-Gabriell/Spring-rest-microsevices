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

    @GetMapping(value = "/{id}/relatoriopdf", produces = "application/json")
    public ResponseEntity<Usuario> init(@PathVariable(value = "id") Long id) {

        Optional<Usuario> usuario = usuarioRepository.findById(id);

        return new ResponseEntity(usuario.get(), HttpStatus.OK);
    }



    @GetMapping(value = "/{id}/codigodevenda/{venda}", produces = "application/json")
    public ResponseEntity<Usuario> relatorio(@PathVariable(value = "id") Long id
            , @PathVariable (value = "venda") Long venda) {

        Optional<Usuario> usuario = usuarioRepository.findById(id);

        return new ResponseEntity(usuario.get(), HttpStatus.OK);

        return (ResponseEntity) ResponseEntity.ok();
    }


    @DeleteMapping(valeu = "/{id}", produces = "application/text")
    Public ResponseEntity delete(@PathVariable("id") Long id) {

        usuarioRepository.deleteById(id);
    }

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<List<Usuario> > usuario() {

        List<Usuario> list = (List<Usuario>) usuarioRepository.findAll();

        return new ResponseEntity<List<Usuario>>(list, HttpStatus.OK);
    }

    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario) {

        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity<Usuario>(usuarioSalvo, HttpStatus.OK);
    }

    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<Usuario> atualizar(@RequestBody Usuario usuario) {

        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity<Usuario>(usuarioSalvo, HttpStatus.OK);
    }

    @PutMapping(value = "/{iduser}/idvenda/{idvenda}", produces = "application/json")
    public ResponseEntity atualziarvenda(@PathVariable Long iduser,
                                         @PathVariable Long idvenda) {

        //Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity("Venda atualizada", HttpStatus.OK);
    }


    @PostMapping(value = "/{iduser}/idvenda/{idvenda}", produces = "application/json")
    public ResponseEntity cadastrarvenda(@PathVariable Long iduser,
                                         @PathVariable Long idvenda) {

        //Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity("id user: " + iduser + " idvenda: " + idvenda, HttpStatus.OK);
    }
}