package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 3L);
		usuario.setNome("André Santos");
		usuario.setEmail("andrezao@escola.com.br");
		em.detach(usuario); //desassocia o objeto do estado gerenciado
		
		em.merge(usuario);
		
//		O Objeto está em estado gerenciado, o que significa que irá alterar, mesmo não dando .merge() o que não é boa prática
//		em.merge(usuario); // faz o processo de update
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
