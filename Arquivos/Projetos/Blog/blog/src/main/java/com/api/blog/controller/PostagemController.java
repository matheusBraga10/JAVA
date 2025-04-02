package com.api.blog.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.blog.dto.PostagemDTO;
import com.api.blog.entity.Categoria;
import com.api.blog.entity.Postagem;
import com.api.blog.service.PostagemService;

@RestController
@RequestMapping("/postagem")
public class PostagemController {
    
    @Autowired
    PostagemService postagemService;
    
    @PostMapping("/{categoriaId}/categoria")
    public ResponseEntity <Object> cadastrar (@PathVariable(value= "categoriaId") Long categoriaId, @RequestBody PostagemDTO postagemDTO){
        postagemService.cadastrar(categoriaId, postagemDTO);
      
        return new ResponseEntity<>("Cadastrado com sucesso.", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> listar(){
        Map<String, Object> response = postagemService.Listar();
        
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Postagem> postagemPorId(@PathVariable(value = "id") Long id){
        Postagem response = postagemService.postagemPorId(id);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{categoriaId}/categoria/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable(value = "categoriaId") Long categoriaId, @PathVariable(value = "id") Long id, @RequestBody PostagemDTO postagemDTO){
        postagemService.atualizar(categoriaId, id, postagemDTO);

        return new ResponseEntity<>("Atualizado com sucesso", HttpStatus.OK);
    }
    
}
