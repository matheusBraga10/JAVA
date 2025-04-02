package com.api.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class PostagemDTO {

    private Long id;
    private String descricao;
    private String titulo;


}
