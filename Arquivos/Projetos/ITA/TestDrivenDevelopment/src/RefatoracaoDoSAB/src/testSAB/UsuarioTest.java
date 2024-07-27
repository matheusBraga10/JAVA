package RefatoracaoDoSAB.src.testSAB;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import RefatoracaoDoSAB.src.SAB.Livro;
import RefatoracaoDoSAB.src.SAB.Usuario;

public class UsuarioTest {

	private Usuario usuario;

	@Before
	public void SetUp() {
		usuario = new Usuario("Jose");
	}

	@Test
	public void whenSituacaoInicialEntaoLivroDisponivelParaEmprestimo() {

		assertEquals(0, (usuario.getLivros()).size());
		assertEquals("Jose", usuario.getNome());
	}

	@Test
	public void whenAnexaLivroNaoNuloAListaDeLivrosEmprestadosPeloUsuarioEntaoIncrementaHumDeListaDeLivrosEmprestados() {

		Livro livro = new Livro("Java Design Patterns", "Pankaj Kumar");
		int tam = (usuario.getLivros()).size();
		usuario.anexaLivroAoUsuario(livro);
		assertEquals(tam + 1, (usuario.getLivros()).size());
	}

	@Test
	public void whenAnexaLivroNuloAListaDeLivrosEmprestadosPeloUsuarioEntaoTamanhoDeListaDeLivrosEmprestadosNaoMuda() {
		
		Livro livro = new Livro("Java Design Patterns", "Pankaj Kumar");
		usuario.anexaLivroAoUsuario(livro);
		Livro livro1 = new Livro("Clojure", "Sally Fields");
		usuario.anexaLivroAoUsuario(livro1);
		Livro livro2 = null;
		int tam = (usuario.getLivros()).size();
		usuario.anexaLivroAoUsuario(livro2);
		assertEquals(tam, (usuario.getLivros()).size());
	}

	@Test
	public void whenDesanexaLivroNaoNuloDeLivrosEmprestadosPeloUsuarioDecrementaHumDeListaDeLivrosEmprestados() {

		Livro livro = new Livro("Java Design Patterns", "Pankaj Kumar");
		usuario.anexaLivroAoUsuario(livro);
		Livro livro1 = new Livro("Clojure", "Sally Fields");
		usuario.anexaLivroAoUsuario(livro1);
		int tam = (usuario.getLivros()).size();
		usuario.desanexaLivroDoUsuario(livro);
		assertEquals(tam - 1, (usuario.getLivros()).size());
	}

	@Test
	public void whenDesanexaLivroNuloDeLivrosEmprestadosPeloUsuarioEntaoTamanhoDeListaDeLivrosEmprestadosNaoMuda() {

		Livro livro = new Livro("Java Design Patterns", "Pankaj Kumar");
		usuario.anexaLivroAoUsuario(livro);
		Livro livro1 = new Livro("Clojure", "Sally Fields");
		usuario.anexaLivroAoUsuario(livro1);
		Livro livro2 = null;
		usuario.anexaLivroAoUsuario(livro2);
		int tam = (usuario.getLivros()).size();
		usuario.desanexaLivroDoUsuario(livro2);
		assertEquals(tam, (usuario.getLivros()).size());
	}

}
