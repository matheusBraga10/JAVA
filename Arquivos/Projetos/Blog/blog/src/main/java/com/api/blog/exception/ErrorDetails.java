package com.api.blog.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ErrorDetails {
    private String mensagem;
    private LocalDateTime data;
    private String details;

    
}
