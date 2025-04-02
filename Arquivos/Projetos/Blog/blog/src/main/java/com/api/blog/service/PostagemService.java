package com.api.blog.service;


import java.util.Map;

import com.api.blog.dto.PostagemDTO;
import com.api.blog.entity.Postagem;

public interface PostagemService {
    void cadastrar(Long categoriaId, PostagemDTO postagemDTO);

    Map<String, Object> Listar ();

    Postagem postagemPorId(Long id);

    void atualizar(Long categoriaId, Long id, PostagemDTO postagemDTO);
    
}
