package com.api.blog.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.blog.dto.CategoriaDTO;
import com.api.blog.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity <Object> cadastrar (@RequestBody CategoriaDTO categoriaDTO){
        categoriaService.cadastrar(categoriaDTO);
        return new ResponseEntity<> ("Cadastrado com sucesso.", HttpStatus.CREATED);
    
    }

    @GetMapping
    public ResponseEntity <Map<String, Object>> listar(){
        Map<String, Object> response = categoriaService.listar();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity <CategoriaDTO> categoriaPorId (@PathVariable(value = "id") Long id){
        CategoriaDTO response = categoriaService.categoriaPorId(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity <Object> atualizar (@PathVariable(value = "id") Long id, @RequestBody CategoriaDTO categoriaDTO) {
        categoriaService.atualizar(id, categoriaDTO);
        return new ResponseEntity<>("Atualizado com sucesso", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Object> deletar (@PathVariable(value = "id") Long id) {
        categoriaService.deletar(id);
        return new ResponseEntity<>("Delete com sucesso", HttpStatus.OK);
    }
}
