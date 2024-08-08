package RefatoracaoDoSAB.src.SAB;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Biblioteca {

	private String _nome;
	private int _nrUnico = 0; 
	private TreeSet<Livro> _repositorioLivros;
	private HashSet<Usuario> _usuarios;

	public Biblioteca(String nome) {
		_nome = nome;
		_repositorioLivros = new TreeSet<Livro>();
		_usuarios = new HashSet<Usuario>();
	}

	public void adicionaLivroCatalogo(Livro livro) throws AdicionarLivroInexistenteException {
		if (livro == null) throw new AdicionarLivroInexistenteException("--->N�o pode adicionar livro inexistente!");
		livro.setNrCatalogo(this.getNrUnico());
		_repositorioLivros.add(livro);
		
	}

	public void registraUsuario(String nome) throws UsuarioJaRegistradoException, UsuarioComNomeVazioException,UsuarioInexistenteException {
		Usuario usuario = new Usuario(nome);
		if (nome == null) throw new UsuarioInexistenteException("--->N�o pode registrar usuario inexistente!");
		if (nome.isEmpty()) throw new UsuarioComNomeVazioException("--->N�o pode registrar usuario com nome vazio!");
		if (_usuarios.contains(usuario)) throw new UsuarioJaRegistradoException("--->J� existe usu�rio com o nome \""+ nome + "\"! Use outro nome!"); 
		_usuarios.add(usuario);
	}

	public void emprestaLivro(Livro livro, Usuario usuario) throws LivroIndisponivelParaEmprestimoException, LivroOuUsuarioNulosException {
		if ((livro == null) && isNotUsuario(usuario)) throw new LivroOuUsuarioNulosException("--->Livro e Usu�rio inexistentes!");
		if (livro == null) throw new LivroOuUsuarioNulosException("--->N�o pode emprestar livro inexistente!");
		if (isNotUsuario(usuario)) throw new LivroOuUsuarioNulosException("--->N�o pode emprestar livro a Usu�rio inexistente!");
		if (livro.getUsuario() != null) throw new LivroIndisponivelParaEmprestimoException("--->Livro " + livro + " indispon�vel para empr�stimo!");
		usuario.anexaLivroAoUsuario(livro);
		livro.anexaUsuarioAoLivro(usuario);
				
	}

	private boolean isNotUsuario(Usuario usuario) {
		return usuario == null;
	}

	public void devolveLivro(Livro livro) throws DevolveLivroDisponivelParaEmprestimoException, DevolveLivroNuloParaEmprestimoException {
		if (livro == null) throw new DevolveLivroNuloParaEmprestimoException("--->N�o pode emprestar livro inexistente!");
		Usuario usuario = livro.getUsuario();
		if (isNotUsuario(usuario)) throw new DevolveLivroDisponivelParaEmprestimoException("---> Tentou devolver livro " + livro + " que est� dispon�vel para empr�stimo!");
		usuario.desanexaLivroDoUsuario(livro);
		livro.desanexaUsuarioDoLivro();
	}
	
	public Livro buscaLivroPorNrCatalogo(int nrUnico) {
		Livro livroAchado = null;
		Iterator<Livro> iter = _repositorioLivros.iterator();
		while ((iter.hasNext() == true) && (livroAchado == null)) {
			Livro livro = (Livro) iter.next();
			int oNrUnico = livro.getNrCatalogo();
			if (oNrUnico == nrUnico) livroAchado = livro;
		}
		return livroAchado;
	}

	public Livro buscaLivroPorTituloAutor(String titulo, String autor) throws TituloOuAutorVazioException, TituloOuAutorNuloException {
		Livro livroAchado = null;
		if ((titulo == null) || (autor == null)) throw new TituloOuAutorNuloException("--->Nome do titulo e/ou do autor �(s�o) nulo(s)<<<");
		if (titulo.isEmpty() || autor.isEmpty()) throw new TituloOuAutorVazioException("--->Nome do titulo e/ou do autor �(s�o) vazio(s)<<<");
		Iterator<Livro> iter = _repositorioLivros.iterator();
		while ((iter.hasNext() == true) && (livroAchado == null)) {
			Livro livro = (Livro) iter.next();
			String oTitulo = livro.getTitulo();
			String oAutor = livro.getAutor();
			if ((oTitulo.equals(titulo)) && (oAutor.equals(autor))) livroAchado = livro;
		}
		return livroAchado;
	}

	public Usuario buscaUsuarioPorNome(String nome) throws BuscaUsuarioComNomeVazioException, BuscaUsuarioComNomeNuloException {
		Usuario usuarioAchado = null;
		if ((nome == null)) throw new BuscaUsuarioComNomeNuloException("--->Nome do usu�rio � nulo<<<");
		if (nome.isEmpty()) throw new BuscaUsuarioComNomeVazioException("--->Nome do usu�rio � vazio<<<");
		Iterator<Usuario> iter = _usuarios.iterator();
		while ((iter.hasNext() == true) && isNotUsuario(usuarioAchado)) {
			Usuario usuario = (Usuario) iter.next();
			String oNome = usuario.getNome();
			if (oNome == nome) usuarioAchado = usuario;
		}
		return usuarioAchado;
	}

	public void exibeLivrosDisponiveis() {
		System.out.println("Biblioteca: " + _nome);
		System.out.println(">>>Livros Dispon�veis para Empr�stimo<<<");
		if (_repositorioLivros.size() == 0) System.out.println("---> Nenhum livro no reposit�rio");
		Iterator<Livro> iter = _repositorioLivros.iterator();
		while (iter.hasNext() == true) {
			Livro livro = (Livro) iter.next();
			if (livro.getUsuario() == null) livro.exibe();
		}
		System.out.println("<<< Livros Dispon�veis >>>\n\n");
	}

	public void exibeLivrosEmprestados() {
		System.out.println("Biblioteca: " + _nome);
		System.out.println(">>>Livros Emprestados<<<");
		if (_repositorioLivros.size() == 0) System.out.println("---> Nenhum livro no reposit�rio");
		Iterator<Livro> iter = _repositorioLivros.iterator();
		while (iter.hasNext() == true) {
			Livro livro = (Livro) iter.next();
			if (livro.getUsuario() != null) {
				System.out.println("\t\t--------------------------------------------");
				livro.exibe();
			}
		}
		System.out.println("<<< Livros Emprestados >>>\n\n");
	}

	public void exibeUsuarios() {
		System.out.println("Biblioteca: " + _nome);
		System.out.println(">>>Usu�rios da Biblioteca<<<");
		if (_usuarios.size() == 0) System.out.println("---> Nenhum usu�rio na Biblioteca");
		Iterator<Usuario> iter = _usuarios.iterator();
		while (iter.hasNext() == true) {
			Usuario usuario = (Usuario) iter.next();
			usuario.exibe();
			}
		System.out.println("<<< Usu�rios >>>\n\n");
	}

	private int getNrUnico() {
		return _nrUnico = _nrUnico + 1;
	}

	public int sizeRepositorioLivros() {
		return _repositorioLivros.size();
	}

	public int sizeUsuarios() {
		return _usuarios.size();
	}

}
