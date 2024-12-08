package com.erudio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erudio.model.Person;
import com.erudio.services.PersonServices;

@RequestMapping("/person")
@RestController
public class PersonController {

	@Autowired
	private PersonServices services;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll() {
		return services.findAll(); 
	}
	
	@GetMapping(value="/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable Long id) {
		
		return services.findById(id); 
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person create(@RequestBody Person person) {
		
		return services.create(person); 
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Person update(@RequestBody Person person) {
		
		return services.update(person); 
	}
	
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		services.delete(id);
		return ResponseEntity.noContent().build(); 
	}
	
	
	 
}
