package com.algaworks.sistemaautenticacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.algaworks.sistemaautenticacao.DTO.UsuarioDTO;
import com.algaworks.sistemaautenticacao.model.Configuracao;
import com.algaworks.sistemaautenticacao.model.Dominio;
import com.algaworks.sistemaautenticacao.model.Usuario;

public class ConsultaJPQL {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Cliente-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
//		CONSULTAS JPQL
//		primeiraConsultas(entityManager);
//		escolhendoORetorno(entityManager);
//		fazendoProjecoes(entityManager);
//		passandoParametros(entityManager);
		
		
		
//		JOIN
//		fazendoInnerJoins(entityManager);
//		fazendoLeftJoin(entityManager);
//		carregamentoComJoinFetch(entityManager);
		
		
		
//		FILTRANDO E ORDENANDO RESULTADOS
//		filtrandoRegistros(entityManager);
//		ordenandoResultados(entityManager);
		paginandoResultados(entityManager);
		
		entityManager.close();
		entityManagerFactory.close();
	}
	

	public static void paginandoResultados(EntityManager entityManager) {
		
		String jpql = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> typedQuery = entityManager.createQuery(jpql, Usuario.class)
				.setFirstResult(2).setMaxResults(2);
		List<Usuario> usuarios = typedQuery.getResultList();
		usuarios.forEach(u -> System.out.println(u.getId() + " | " + u.getNome()));
	}
	
	public static void ordenandoResultados(EntityManager entityManager) {
		
		String jpql = "SELECT u FROM Usuario u ORDER BY u.nome";
		TypedQuery<Usuario> typedQuery = entityManager.createQuery(jpql, Usuario.class);
		List<Usuario> usuarios = typedQuery.getResultList();
		usuarios.forEach(u -> System.out.println(u.getId() + " | " + u.getNome()));
	}
	
	public static void filtrandoRegistros(EntityManager entityManager) {
//		LIKE, IS NULL, IS EMPTY, BETWEEN, <, >, <=, >=, =, <>.
		
		String jpql = "SELECT u FROM Usuario u WHERE u.nome LIKE :nomeUsuario";
		TypedQuery<Usuario> typedQuery = entityManager.
				createQuery(jpql, Usuario.class).setParameter("nomeUsuario", "%Lightman%");
		List<Usuario> usuarios = typedQuery.getResultList();
		usuarios.forEach(u -> System.out.println(u.getId() + " | " + u.getNome()));
	}
	
	public static void carregamentoComJoinFetch(EntityManager entityManager) {
		
//		JOIN FETCH
		String jpql = "SELECT u FROM  Usuario u JOIN FETCH u.configuracao JOIN FETCH u.dominio";
		TypedQuery<Usuario> typedQuery = entityManager.createQuery(jpql, Usuario.class);
		List<Usuario> usuarios = typedQuery.getResultList();
		usuarios.forEach(u -> System.out.println(u.getId() + " - " + u.getNome()));
		
		
		
	}
	
	public static void fazendoLeftJoin(EntityManager entityManager) {
		
//		LEFT JOIN
		String jpql = "SELECT u, c FROM Usuario u LEFT JOIN u.configuracao c";
		TypedQuery<Object[]> typedQuery = entityManager.createQuery(jpql, Object[].class);
		List<Object[]> objects = typedQuery.getResultList();
		objects.forEach(arr -> {
//			arr[0] == Usuario;
//			arr[1] == Configuracao;
			String out = ((Usuario) arr[0]).getNome();
			if (arr[1] == null) {
				out += ", NULL";
			} else {
				out += ", " +((Configuracao) arr[1]).getId();
			}
			System.out.println(out);
		});
	}
	
	public static void fazendoInnerJoins(EntityManager entityManager) {
//		INNER JOIN (por padrão)
		String jpql = "SELECT u FROM Usuario u JOIN u.dominio d WHERE d.id = 1";
//		String sql  = "SELECT u.* FROM usuario u JOIN dominio d ON u.dominio_id = d.id";
		TypedQuery<Usuario> typedQuery = entityManager.createQuery(jpql, Usuario.class);
		List<Usuario> usuarios = typedQuery.getResultList();
		usuarios.forEach(u -> System.out.println(u.getNome() + " " + u.getId()));
	}
	
	public static void passandoParametros(EntityManager entityManager) {
		
		
		String jpqlPP = "SELECT u FROM Usuario u WHERE u.id = :id_usuario";
		TypedQuery<Usuario> typedQueryPP = entityManager.createQuery(jpqlPP , Usuario.class);
		typedQueryPP.setParameter("id_usuario", 3 );
		Usuario usuario = typedQueryPP.getSingleResult();
		System.out.println(usuario.getId() + ", " + usuario.getNome());
		
		
	}
	
	public static void fazendoProjecoes(EntityManager entityManager) {
		
//		FORMA PADRÃO
		String jpqlArr = "SELECT id, login, nome FROM Usuario ";
		TypedQuery<Object[]> typedQueryArr = entityManager.createQuery(jpqlArr , Object[].class);
		List<Object[]> listaArr = typedQueryArr.getResultList();
		listaArr.forEach (arr -> System.out.println(String.format("%s, %s, %s" , arr)));
		
//		FORMA DTO
		String jpqlDTO = "SELECT new "
				+ "com.algaworks.sistemaautenticacao.model.UsuarioDTO(id, login, nome) "
				+ " FROM Usuario ";
		TypedQuery<UsuarioDTO> typedQueryDTO = entityManager.createQuery(jpqlDTO , UsuarioDTO.class);
		List<UsuarioDTO> listaDTO = typedQueryDTO.getResultList();
		listaDTO.forEach (dto -> System.out.println("DTO: " + dto.getId() + " - " + dto.getNome() + " | " + dto.getLogin()));
	}
	
	public static void escolhendoORetorno(EntityManager entityManager) {

//		RETORNANDO DADOS DE OUTRA TABELA USANDO RELACIONAMENTO
		String jpql = "SELECT u.dominio FROM Usuario u WHERE u.id = 1 ";
		TypedQuery<Dominio> typedQuery = entityManager.createQuery(jpql , Dominio.class);
		Dominio d = typedQuery.getSingleResult();
		System.out.println(d.getId() + ", " + d.getNome());
		
//		RETORNANDO DADOS DA MESMA TABELA SELECIONANDO ATRIBUTOS
		String jqplNomes = "SELECT u.nome FROM Usuario u ";
		TypedQuery<String> typedQueryNomes = entityManager.createQuery(jqplNomes , String.class);
		List<String> listaNome = typedQueryNomes.getResultList();
		listaNome.forEach(u -> System.out.println(u));
		
	}
	
	public static void primeiraConsultas(EntityManager entityManager) {
	
//		CONSULTA LISTA
		String jpql = "SELECT u FROM Usuario u ";
		TypedQuery<Usuario> typedQuery = entityManager.createQuery(jpql , Usuario.class);
		List<Usuario> lista = typedQuery.getResultList();
		lista.forEach(u -> System.out.println(u.getId() + ", " + u.getNome()));
		
//		CONSULTA SINGLE
		String jpqlSingle = "SELECT u FROM Usuario u WHERE u.id = 1";
		TypedQuery<Usuario> typedQuerySingle = entityManager.createQuery(jpqlSingle , Usuario.class);
		Usuario usuario = typedQuerySingle.getSingleResult();
		System.out.println(usuario.getId() + " - " + usuario.getNome());
		
//		CONSULTA SINGLE SEM PERCORRER LISTA
		String jpqlCast = "SELECT u FROM Usuario u WHERE u.id = 1";
		Query query = entityManager.createQuery(jpqlCast);
		Usuario usuario2 = (Usuario) query.getSingleResult();
		System.out.println(usuario2.getId() + " - " + usuario2.getNome());
		
	}

}

