package br.com.cod3r.execiciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping(path = { "/ola", "/saudacao" })
//	@RequestMapping(method = RequestMethod.GET, path = "/ola") // Outro método para o @GetMapping
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	

}
