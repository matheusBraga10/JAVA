package com.algaworks.cadastrocliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.cadastrocliente.model.Cliente;

public class ExemploUpdate {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("Cliente-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
//		Cliente cliente = entityManager.find(Cliente.class, 1); // Outro método para atualizar o banco de dados
//		cliente.setNome(cliente.getNome() + " Alterado");  		// Outro método para atualizar o banco de dados

		
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("Armazén Estrela");
		
		
		entityManager.getTransaction().begin(); 	// Necessário para realizar commit (alterações no banco de dados)
		entityManager.merge(cliente); 				// Atualiza o banco de dados
		entityManager.getTransaction().commit();	// Necessário para realizar commit (alterações no banco de dados)
		
		entityManager.close();
		entityManagerFactory.close();
	}
}

