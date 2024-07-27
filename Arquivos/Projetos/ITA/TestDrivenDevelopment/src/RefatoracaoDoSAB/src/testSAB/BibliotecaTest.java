package RefatoracaoDoSAB.src.testSAB;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import RefatoracaoDoSAB.src.SAB.AdicionarLivroInexistenteException;
import RefatoracaoDoSAB.src.SAB.Biblioteca;
import RefatoracaoDoSAB.src.SAB.BuscaUsuarioComNomeNuloException;
import RefatoracaoDoSAB.src.SAB.BuscaUsuarioComNomeVazioException;
import RefatoracaoDoSAB.src.SAB.DevolveLivroDisponivelParaEmprestimoException;
import RefatoracaoDoSAB.src.SAB.DevolveLivroNuloParaEmprestimoException;
import RefatoracaoDoSAB.src.SAB.Livro;
import RefatoracaoDoSAB.src.SAB.LivroIndisponivelParaEmprestimoException;
import RefatoracaoDoSAB.src.SAB.LivroOuUsuarioNulosException;
import RefatoracaoDoSAB.src.SAB.TituloOuAutorNuloException;
import RefatoracaoDoSAB.src.SAB.TituloOuAutorVazioException;
import RefatoracaoDoSAB.src.SAB.Usuario;
import RefatoracaoDoSAB.src.SAB.UsuarioComNomeVazioException;
import RefatoracaoDoSAB.src.SAB.UsuarioInexistenteException;
import RefatoracaoDoSAB.src.SAB.UsuarioJaRegistradoException;

public class BibliotecaTest {

	private Biblioteca biblioteca;
	private Livro livro1, livro2, livro3, livro4;
	private Usuario usuario1, usuario2, usuario3;
	
	@Before
	public void SetUp() throws AdicionarLivroInexistenteException, UsuarioJaRegistradoException, UsuarioComNomeVazioException, 
			UsuarioInexistenteException, BuscaUsuarioComNomeVazioException, BuscaUsuarioComNomeNuloException {
		
		biblioteca = new Biblioteca("ITA");
		livro1 = new Livro("Java Design Patterns", "Pankaj Kumar");
		biblioteca.adicionaLivroCatalogo(livro1);

		livro2 = new Livro("Clojure", "Sally Fields");
		biblioteca.adicionaLivroCatalogo(livro2);

		livro3 = new Livro("Using CRC Cards", "Nancy Wilkinson");
		biblioteca.adicionaLivroCatalogo(livro3);

		livro4 = new Livro("Using CRC Cards", "Nancy Wilkinson");
		biblioteca.adicionaLivroCatalogo(livro4);

		biblioteca.registraUsuario("Jose");
		usuario1 = biblioteca.buscaUsuarioPorNome("Jose");
		biblioteca.registraUsuario("Joao");
		usuario2 = biblioteca.buscaUsuarioPorNome("Joao");
		biblioteca.registraUsuario("Joaquim");
		usuario3 = biblioteca.buscaUsuarioPorNome("Joaquim");
	}

	@Test
	public void whenEmprestoUmLivroAUsuarioEntaoLivroFicaIndisponivelParaEmprestimo() throws LivroIndisponivelParaEmprestimoException,
			LivroOuUsuarioNulosException {

		biblioteca.emprestaLivro(livro2, usuario1);
		assertEquals(usuario1, livro2.getUsuario());

		biblioteca.emprestaLivro(livro3, usuario2);
		assertEquals(usuario2, livro3.getUsuario());
	}

	@Test
	public void whenDevolvoUmLivroEmprestadoAUsuarioEntaoLivroFicaDisponivelParaEmprestimo() throws LivroIndisponivelParaEmprestimoException,
			LivroOuUsuarioNulosException, DevolveLivroDisponivelParaEmprestimoException, DevolveLivroNuloParaEmprestimoException {
		biblioteca.emprestaLivro(livro3, usuario2);
		biblioteca.devolveLivro(livro3);

		assertEquals(null, livro3.getUsuario());
	}

	@Test
	public void whenEmprestoTresLivrosAUmUnicosUsuarioSemLivrosEmprestadosEntaoListaLivrosdoUsuarioTemTam3() 
			throws LivroIndisponivelParaEmprestimoException, LivroOuUsuarioNulosException {

		biblioteca.emprestaLivro(livro1, usuario3);
		biblioteca.emprestaLivro(livro3, usuario3);
		biblioteca.emprestaLivro(livro4, usuario3);
		
		assertEquals(3, (usuario3.getLivros()).size());
	}

	@Test(expected = LivroIndisponivelParaEmprestimoException.class)
	public void whenEmprestoLivroJahEmprestadoEntaoLivroIndisponivelParaEmprestimoExceptionEhLancada()
			throws LivroIndisponivelParaEmprestimoException, LivroOuUsuarioNulosException {

		biblioteca.emprestaLivro(livro2, usuario1);
		biblioteca.emprestaLivro(livro1, usuario3);
		biblioteca.emprestaLivro(livro3, usuario3);
		biblioteca.emprestaLivro(livro4, usuario3);
		biblioteca.emprestaLivro(livro2, usuario3);
	}

	@Test(expected = LivroOuUsuarioNulosException.class)
	public void whenEmprestoLivroNuloAUsuarioNaoNuloEntaoLivroOuUsuarioNulosExceptionEhLancada()
			throws LivroIndisponivelParaEmprestimoException, LivroOuUsuarioNulosException {

		biblioteca.emprestaLivro(null, usuario2);
	}

	@Test(expected = LivroOuUsuarioNulosException.class)
	public void whenEmprestoLivroNaoNuloAUsuarioNuloEntaoLivroOuUsuarioNulosExceptionEhLancada()
			throws LivroIndisponivelParaEmprestimoException, LivroOuUsuarioNulosException {

		biblioteca.emprestaLivro(livro4, null);
	}

	@Test(expected = LivroOuUsuarioNulosException.class)
	public void whenEmprestoLivroNuloAUsuarioNuloEntaoLivroOuUsuarioNulosExceptionEhLancada()
			throws LivroIndisponivelParaEmprestimoException, LivroOuUsuarioNulosException {

		biblioteca.emprestaLivro(null, null);
	}

	@Test(expected = DevolveLivroDisponivelParaEmprestimoException.class)
	public void whenDevolvoLivroDisponivelParaEmprestimoEntaoDevolveLivroDisponivelParaEmprestimoExceptionEhLancada()
			throws LivroIndisponivelParaEmprestimoException, LivroOuUsuarioNulosException, DevolveLivroDisponivelParaEmprestimoException,
			DevolveLivroNuloParaEmprestimoException {

		biblioteca.emprestaLivro(livro2, usuario1);
		biblioteca.emprestaLivro(livro3, usuario3);
		biblioteca.emprestaLivro(livro4, usuario3);
		biblioteca.devolveLivro(livro1);
	}

	@Test(expected = DevolveLivroNuloParaEmprestimoException.class)
	public void whenDevolvoLivroNuloParaEmprestimoEntaoDevolveLivroNuloParaEmprestimoExceptionEhLancada()
			throws LivroIndisponivelParaEmprestimoException, LivroOuUsuarioNulosException,
			DevolveLivroDisponivelParaEmprestimoException, DevolveLivroNuloParaEmprestimoException {

		biblioteca.devolveLivro(null);
	}

	@Test
	public void whenBuscoLivroPeloNrCatalogoEntaoRetornoLivroCujoNrCatalogoConfere() {

		Livro livro = biblioteca.buscaLivroPorNrCatalogo(2);
		
		assertEquals(2, livro.getNrCatalogo());
	}

	@Test
	public void whenBuscoLivroPeloNrCatalogoInexistenteEntaoLivroEhNulo() {

		Livro livroHum = biblioteca.buscaLivroPorNrCatalogo(0);
		Livro livroDois = biblioteca.buscaLivroPorNrCatalogo(5);
		
		assertEquals(null, livroHum);
		assertEquals(null, livroDois);
	}

	@Test
	public void whenBuscoLivroPorTituloEAutorEntaoRetornoLivroCujoTituloEAutorConfere() 
			throws TituloOuAutorVazioException, TituloOuAutorNuloException {

		Livro livroTres = biblioteca.buscaLivroPorTituloAutor("Using CRC Cards", "Nancy Wilkinson");
		Livro livroHum = biblioteca.buscaLivroPorTituloAutor("Java Design Patterns", "Pankaj Kumar");

		assertEquals(3, livroTres.getNrCatalogo());
		assertEquals(1, livroHum.getNrCatalogo());
	}

	@Test
	public void whenBuscoLivroPorTituloOuAutorENaoEncontroEntaoRetornoLivroNulo()
			throws TituloOuAutorVazioException, TituloOuAutorNuloException {

		Livro livro = biblioteca.buscaLivroPorTituloAutor("Using CRC Cards", "Pankaj Kumar");
		assertEquals(null, livro);

		livro = biblioteca.buscaLivroPorTituloAutor("Padr�es de Projeto em Java", "Pankaj Kumar");
		assertEquals(null, livro);

		livro = biblioteca.buscaLivroPorTituloAutor("Padr�es de Projeto em Java", "Eduardo Guerra");
		assertEquals(null, livro);
	}

	@Test(expected = TituloOuAutorVazioException.class)
	public void whenBuscoLivroPorTituloNaoVazioEAutorVazioEntaoTituloOuAutorVazioExceptionEhLancada()
			throws TituloOuAutorVazioException, TituloOuAutorNuloException {

		biblioteca.buscaLivroPorTituloAutor("Using CRC Cards", "");
	}

	@Test(expected = TituloOuAutorVazioException.class)
	public void whenBuscoLivroPorTituloVazioEAutorNaoVazioEntaoTituloOuAutorVazioExceptionEhLancada()
			throws TituloOuAutorVazioException, TituloOuAutorNuloException {

		biblioteca.buscaLivroPorTituloAutor("", "Nancy Wilkinson");
	}

	@Test(expected = TituloOuAutorVazioException.class)
	public void whenBuscoLivroPorTituloVazioEAutorVazioEntaoTituloOuAutorVazioExceptionEhLancada()
			throws TituloOuAutorVazioException, TituloOuAutorNuloException {

		biblioteca.buscaLivroPorTituloAutor("", "");
	}

	@Test(expected = TituloOuAutorNuloException.class)
	public void whenBuscoLivroPorTituloNaoNuloEAutorNuloEntaoTituloOuAutorVazioExceptionEhLancada()
			throws TituloOuAutorVazioException, TituloOuAutorNuloException {

		biblioteca.buscaLivroPorTituloAutor("Using CRC Cards", null);
	}

	@Test(expected = TituloOuAutorNuloException.class)
	public void whenBuscoLivroPorTituloNuloEAutorNaoNuloEntaoTituloOuAutorVazioExceptionEhLancada()
			throws TituloOuAutorVazioException, TituloOuAutorNuloException {

		biblioteca.buscaLivroPorTituloAutor(null, "Nancy Wilkinson");
	}

	@Test(expected = TituloOuAutorNuloException.class)
	public void whenBuscoLivroPorTituloNuloEAutorNuloEntaoTituloOuAutorVazioExceptionEhLancada()
			throws TituloOuAutorVazioException, TituloOuAutorNuloException {

		biblioteca.buscaLivroPorTituloAutor(null, null);
	}

	@Test
	public void whenBuscoUsuarioPorNomeExistenteEntaoRetornoUsuarioValido()
			throws BuscaUsuarioComNomeVazioException, BuscaUsuarioComNomeNuloException {

		Usuario usuario = biblioteca.buscaUsuarioPorNome("Jose");
		assertEquals("Jose", usuario.getNome());

		usuario = biblioteca.buscaUsuarioPorNome("Joaquim");
		assertEquals("Joaquim", usuario.getNome());
	}

	@Test
	public void whenBuscoUsuarioPorNomeInexistenteEntaoRetornoUsuarioNulo()
			throws BuscaUsuarioComNomeVazioException, BuscaUsuarioComNomeNuloException {

		Usuario usuario = biblioteca.buscaUsuarioPorNome("Eduardo");
		assertEquals(null, usuario);

		usuario = biblioteca.buscaUsuarioPorNome("Clovis");
		assertEquals(null, usuario);
	}

	@Test(expected = BuscaUsuarioComNomeVazioException.class)
	public void whenBuscoUsuarioPorNomeVazioEntaoBuscaUsuarioComNomeVazioExceptionEhLancada()
			throws BuscaUsuarioComNomeVazioException, BuscaUsuarioComNomeNuloException {

		biblioteca.buscaUsuarioPorNome("");
	}

	@Test(expected = BuscaUsuarioComNomeNuloException.class)
	public void whenBuscoUsuarioPorNomeNuloEntaoBuscaUsuarioComNomeNuloExceptionEhLancada()
			throws BuscaUsuarioComNomeVazioException, BuscaUsuarioComNomeNuloException {

		biblioteca.buscaUsuarioPorNome(null);
	}

}
