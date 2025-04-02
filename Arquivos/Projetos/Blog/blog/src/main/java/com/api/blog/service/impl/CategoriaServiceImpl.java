package com.api.blog.service.impl;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.blog.dto.CategoriaDTO;
import com.api.blog.entity.Categoria;
import com.api.blog.exception.NotFoundException;
import com.api.blog.exception.RegraDeNegocio;
import com.api.blog.repository.CategoriaRepository;
import com.api.blog.service.CategoriaService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Override
    public void cadastrar(CategoriaDTO categoriaDTO) {
        Categoria categoria = mapToEntidade(categoriaDTO);
        validarDescricao(categoriaDTO.getDescricao());
        LocalDateTime data = LocalDateTime.now();
        categoria.setDataCadastro(data);
        categoria.setDataAtualizacao(data);
        
        categoriaRepository.save(categoria);
    }

    private Categoria mapToEntidade(CategoriaDTO categoriaDTO) {
        Categoria categoria = Categoria.builder()
            .id(categoriaDTO.getId())
            .descricao(categoriaDTO.getDescricao())    
            .build();
        return categoria;
    }

    private void validarDescricao(String descricao) {
        
        Optional<Categoria> categoriaCadastrada = categoriaRepository.findByDescricao(descricao);
        if(categoriaCadastrada.isPresent()){
            throw new RegraDeNegocio("Descrição já cadastrada.");
        }
    }

    @Override
    public Map<String, Object> listar() {
        List<Categoria> categorias = categoriaRepository.findAll(); 
        Map<String, Object> response = new HashMap<>();
        response.put("content", categorias);
        response.put("total", categorias.size());
        return response;   
    }

    @Override
    public CategoriaDTO categoriaPorId(Long id) {
            Categoria categoria = categoriaRepository.findById(id).orElseThrow(() -> new NotFoundException("Categoria não encontrada")) ;
        return mapToDTO(categoria);
    }

    private CategoriaDTO mapToDTO (Categoria categoria){
        CategoriaDTO categoriaDTO = CategoriaDTO.builder()
            .id(categoria.getId())
            .descricao(categoria.getDescricao())
            .build();
        return categoriaDTO;
    }

    @Override
    public void atualizar(Long id, CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow(() -> new NotFoundException("Categoria não encontrada")) ;
        categoria.setDescricao(categoriaDTO.getDescricao());
        categoria.setDataAtualizacao(LocalDateTime.now());
        categoriaRepository.save(categoria);
    }

    @Override
    public void deletar(Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow(() -> new NotFoundException("Categoria não encontrada")) ;
        categoriaRepository.delete(categoria);
    }

    
}
