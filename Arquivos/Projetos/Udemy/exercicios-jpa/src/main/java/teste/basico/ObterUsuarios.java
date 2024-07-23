package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpgl = "SELECT u FROM Usuario u";
		
		TypedQuery<Usuario> query = em.createQuery(jpgl, Usuario.class);
		query.setMaxResults(2);
		
		List<Usuario> usuarios = query.getResultList();
		
		for (Usuario usuario : usuarios) {
			System.out.println("Id: " + usuario.getId() + " | Nome: " + usuario.getNome() + " | E-mail: " + usuario.getEmail());
		}
		
		
		em.close();
		emf.close();
	}
}
