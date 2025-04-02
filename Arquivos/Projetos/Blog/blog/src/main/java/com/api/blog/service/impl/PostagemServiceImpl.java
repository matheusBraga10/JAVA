package com.api.blog.service.impl;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.blog.dto.PostagemDTO;
import com.api.blog.entity.Categoria;
import com.api.blog.entity.Postagem;
import com.api.blog.exception.NotFoundException;
import com.api.blog.repository.CategoriaRepository;
import com.api.blog.repository.PostagemRepository;
import com.api.blog.service.PostagemService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PostagemServiceImpl implements PostagemService {
    
    @Autowired
    PostagemRepository postagemRepository;
    @Autowired
    CategoriaRepository categoriaRepository;
    
    @Override
    public void cadastrar(Long categoriaId, PostagemDTO postagemDTO) {
        Categoria categoria = categoriaRepository.findById(categoriaId).orElseThrow(() -> new NotFoundException("Categoria não encontrada."));
        Postagem postagem = mapToEntity(postagemDTO);
        postagem.setCategoria(categoria);
        postagem.setDataCadastro(LocalDateTime.now());
        postagem.setDataAtualizacao(LocalDateTime.now());
        postagemRepository.save(postagem);
    }
    
    private Postagem mapToEntity(PostagemDTO postagemDTO){
        Postagem postagem = Postagem.builder()
            .id(postagemDTO.getId())
            .descricao(postagemDTO.getDescricao())
            .titulo(postagemDTO.getTitulo())
            .build();
        return postagem;
    }

    @Override
    public Map<String, Object> Listar() {
        List<Postagem> postagens = postagemRepository.findAll();
        Map<String, Object> response = new HashMap<>();
        response.put("content", postagens);
        response.put("total", postagens.size());

        return response;
    }

    @Override
    public Postagem postagemPorId(Long id) {
        Postagem postagem = postagemRepository.findById(id).orElseThrow(() -> new NotFoundException("Postagem não encontrada."));

        return postagem;
    }

    @Override
    public void atualizar(Long categoriaId, Long id, PostagemDTO postagemDTO) {
        Categoria categoria = categoriaRepository.findById(categoriaId).orElseThrow(() -> new NotFoundException(("Categoria não encontrada.")));
        Postagem postagem = postagemRepository.findById(id).orElseThrow(() -> new NotFoundException("Postagem não encontrada."));
        postagem.setDescricao(postagemDTO.getDescricao());
        postagem.setDataAtualizacao(LocalDateTime.now());
        postagem.setTitulo(postagemDTO.getTitulo());
        postagem.setCategoria(categoria);
        postagemRepository.save(postagem);

    }
    
    
}
