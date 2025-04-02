package com.api.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.blog.entity.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
    
    Optional<Postagem> findByDescricao (String descricao);
    
}
