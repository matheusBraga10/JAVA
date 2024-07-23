package com.algaworks.sistemafuncionarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;

import com.algaworks.sistemafuncionarios.model.Artigo;

public class LockPessimista {
	
	private static final Integer ID = 1;
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Cliente-PU");
		
//		entendendoAsOpcoes(entityManagerFactory);
//		javaEOWorkbench(entityManagerFactory);
		casoMaisPratico(entityManagerFactory);
		
	}
	
	public static void entendendoAsOpcoes(EntityManagerFactory entityManagerFactory) {
		
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		
//		PESSIMISTIC_WRITE = Garante a pesquisa somente para instancia que possui lock até o mesmo fazer commit (travando o código) IMPORTANTE PARA TRANSAÇÕES  
//		PESSIMISTIC_READ  = Garante a pesquisa para todos, mas não permite os demais fazerem commit enquanto a instancia que contem lock não fazer commit (trava o código).
		
		entityManager1.getTransaction().begin();
		Artigo artigo1 = entityManager1.find(Artigo.class, ID, LockModeType.PESSIMISTIC_WRITE);
		artigo1.setConteudo("Alteração do João");
		entityManager1.getTransaction().commit();
		
		entityManager2.getTransaction().begin();
		Artigo artigo2 = entityManager2.find(Artigo.class, ID, LockModeType.PESSIMISTIC_READ );
		artigo2.setConteudo("Alteração do Matheus");
		
		entityManager2.getTransaction().commit();
//		entityManager1.getTransaction().commit();
		
	}	
	
	public static void javaEOWorkbench(EntityManagerFactory entityManagerFactory) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		log(1, "Imediatamente antes find.");
		Artigo artigo1 = entityManager.find(Artigo.class, ID);
		log(1, "Imediatamente após find.");

		artigo1.setConteudo("Alteração do João (TH1)");
		
		log(1, "Esperando 15 segundos...");
		esperar(15000);
		log(1, "Espera dos 15 segundos terminada.");

		log(1, "Imediatamente antes do commit.");
		entityManager.getTransaction().commit();
		log(1, "Imediatamente após o commit.");
		
	}
	
	private static void log(Integer thread, String msg) {
		System.out.println("[THREAD " + thread + "] " + msg);
	}
	
	private static void esperar(long miliSegundos) {
		try {
			Thread.sleep(miliSegundos);
		} catch (Exception e) {}
	}
	
	public static void casoMaisPratico(EntityManagerFactory entityManagerFactory) {
		
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		
		Runnable runnable1 = () -> {
			entityManager1.getTransaction().begin();
			log(1, "Imediatamente antes do find.");
			Artigo artigo1 = entityManager1.find(Artigo.class, ID, LockModeType.PESSIMISTIC_WRITE);
			log(1, "Imediatamente após o find.");
			artigo1.setConteudo("Alteração do Matheus (TH1)");
			log(1, "Esperando 3 segundos...");
			esperar(3000);
			log(1, "Espera dos 3 segundos terminada.");
			log(1, "Imediatamente antes do commit.");
			entityManager1.getTransaction().commit();
			log(1, "Imediatamente após do commit.");
			
		};
		
		Runnable runnable2 = () -> {
			entityManager2.getTransaction().begin();
			log(2, "Imediatamente antes do find.");
			Artigo artigo2 = entityManager2.find(Artigo.class, ID, LockModeType.PESSIMISTIC_WRITE);
			log(2, "Imediatamente após o find.");
			artigo2.setConteudo(artigo2.getConteudo() + " + Alteração do Ana (TH2)");
			log(2, "Esperando 3 segundos...");
			esperar(100);
			log(2, "Espera dos 3 segundos terminada.");
			log(2, "Imediatamente antes do commit.");
			entityManager2.getTransaction().commit();
			log(2, "Imediatamente após do commit.");
		};

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
//		Mesmo runnable2 sendo mais rápido que runnable1, 
//		este é obrigado a esperar o commit do anterior para poder ler e atualzar o BD
		
		thread1.start();
		thread2.start();
	}
	
	
}

