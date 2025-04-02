package com.api.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (value = HttpStatus.BAD_REQUEST)
public class RegraDeNegocio extends RuntimeException {

    public RegraDeNegocio (String mensagem){
        super(mensagem);
    }

    
}
