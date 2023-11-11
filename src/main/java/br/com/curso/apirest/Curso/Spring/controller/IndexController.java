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

@RestController /* Arquitetura REST */
@RequestMapping(value = "/usuario")
public class IndexController {

    @Autowired /* de fosse CDI seria @Inject*/
    private UsuarioRepository usuarioRepository;


    /* Serviço RESTful */
    @GetMapping(value = "/{id}/codigovenda/{venda}", produces = "application/json")
    public ResponseEntity<Usuario> relatorio(@PathVariable (value = "id") Long id
            , @PathVariable (value = "venda") Long venda) {

        Optional<Usuario> usuario = usuarioRepository.findById(id);

        /*o retorno seria um relatorio*/
        return new ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
    }


    /* Serviço RESTful */
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Usuario> init(@PathVariable (value = "id") Long id) {

        Optional<Usuario> usuario = usuarioRepository.findById(id);

        return new ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}", produces = "application/text")
    public String delete (@PathVariable("id") Long id){

        usuarioRepository.deleteById(id);

        return "Deletado com sucesso!";
    }


    @DeleteMapping(value = "/{id}/venda", produces = "application/text")
    public String deletevenda(@PathVariable("id") Long id){

        usuarioRepository.deleteById(id);

        return "ok";
    }


    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<List<Usuario>> usuario (){

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

        /*outras rotinas antes de atualizar*/

        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity<Usuario>(usuarioSalvo, HttpStatus.OK);

    }



    @PutMapping(value = "/{iduser}/idvenda/{idvenda}", produces = "application/json")
    public ResponseEntity updateVenda(@PathVariable Long iduser,
                                      @PathVariable Long idvenda) {
        /*outras rotinas antes de atualizar*/

        //Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity("Venda atualzada", HttpStatus.OK);

    }


    @PostMapping(value = "/{iduser}/idvenda/{idvenda}", produces = "application/json")
    public ResponseEntity cadastrarvenda(@PathVariable Long iduser,
                                         @PathVariable Long idvenda) {

        /*Aqui seria o processo de venda*/
        //Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity("id user :" + iduser + " idvenda :"+ idvenda, HttpStatus.OK);

    }




}