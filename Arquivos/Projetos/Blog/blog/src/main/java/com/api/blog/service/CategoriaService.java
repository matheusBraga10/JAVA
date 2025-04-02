package com.api.blog.service;

import java.util.Map;

import com.api.blog.dto.CategoriaDTO;

public interface CategoriaService {
    
    void cadastrar(CategoriaDTO categoriaDTO);
    
    Map<String, Object> listar ();

    CategoriaDTO categoriaPorId (Long id);

    void atualizar (Long id, CategoriaDTO categoriaDTO);

    void deletar (Long id);
}
