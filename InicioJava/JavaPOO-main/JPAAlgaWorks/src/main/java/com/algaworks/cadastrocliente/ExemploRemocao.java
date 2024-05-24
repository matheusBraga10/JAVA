package com.algaworks.cadastrocliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.cadastrocliente.model.Cliente;

public class ExemploRemocao {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("Cliente-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Cliente cliente = entityManager.find(Cliente.class, 2);

		
		entityManager.getTransaction().begin(); 	// Necessário para realizar commit (alterações no banco de dados)
		
		entityManager.remove(cliente); 				// Persiste a alteração para o banco de dados
		
		entityManager.getTransaction().commit(); 	// Necessário para realizar commit (alterações no banco de dados)
		
		
		
		entityManager.close();
		entityManagerFactory.close();
	}
}

