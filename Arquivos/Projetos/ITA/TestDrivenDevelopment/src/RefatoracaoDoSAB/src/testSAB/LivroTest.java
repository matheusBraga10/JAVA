package RefatoracaoDoSAB.src.testSAB;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import RefatoracaoDoSAB.src.SAB.Livro;
import RefatoracaoDoSAB.src.SAB.Usuario;

public class LivroTest {

	private Livro livro;
	
	@Before
	public void SetUp() {
		livro = new Livro("Java Design Patterns", "Pankaj Kumar");
	}

	@Test
	public void whenSituacaoInicialEntaoLivroDisponivelParaEmprestimo() {

		assertEquals(null, livro.getUsuario());
		assertEquals("Java Design Patterns", livro.getTitulo());
		assertEquals("Pankaj Kumar", livro.getAutor());
	}

	@Test
	public void whenAnexaUsuarioNaoNuloAoLivroEntaoLivroFicaIndisponivelParaEmprestimo() {

		Usuario usuario1 = new Usuario("Jose");
		livro.anexaUsuarioAoLivro(usuario1);
		assertEquals(usuario1, livro.getUsuario());
	}

	@Test
	public void whenAnexaUsuarioNuloAoLivroEntaoLivroFicaDisponivelParaEmprestimo() {

		Usuario usuario1 = null;
		livro.anexaUsuarioAoLivro(usuario1);
		assertEquals(usuario1, livro.getUsuario());
	}

	@Test
	public void whenDesanexaUsuarioNaoNuloDoLivroEntaoLivroFicaDisponivelParaEmprestimo() {

		Usuario usuario1 = new Usuario("Jose");
		livro.anexaUsuarioAoLivro(usuario1);
		livro.desanexaUsuarioDoLivro();
		assertEquals(null, livro.getUsuario());
	}

	@Test
	public void whenDesanexaUsuarioNuloDoLivroEntaoLivroContinuaDisponivelParaEmprestimo() {

		Usuario usuario1 = null;
		livro.anexaUsuarioAoLivro(usuario1);
		livro.desanexaUsuarioDoLivro();
		assertEquals(null, livro.getUsuario());
	}

}
