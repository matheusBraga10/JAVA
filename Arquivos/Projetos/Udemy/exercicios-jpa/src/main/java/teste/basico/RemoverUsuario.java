package teste.basico;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String resposta = "";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		
		if(usuario != null) {
			System.out.println("Deseja remover o usuário " + usuario.getId() + " - " + usuario.getNome() + " do banco de dados? Y / N");
			resposta = scanner.nextLine();
			if(resposta.equalsIgnoreCase("y")) {
				em.getTransaction().begin();
				em.remove(usuario);
				em.getTransaction().commit();
				System.out.println("Usuário removido com sucesso.");
				  
			} else {
				System.out.println("Usuário não removido.");
			}
		} else {
			System.out.println("Usuário inexistente! ");
		}
		
		scanner.close();
		em.close();
		emf.close();
	}
}
