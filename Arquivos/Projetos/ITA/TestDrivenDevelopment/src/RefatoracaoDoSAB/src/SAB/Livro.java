package RefatoracaoDoSAB.src.SAB;

public class Livro implements Comparable<Object> {
	
	private int _nrCatalogo;
	private String _titulo;
	private String _autor;
	private Usuario _usuario;

	public Livro(String titulo, String autor) {
		setTitulo(titulo);
		setAutor(autor);
		desanexaUsuarioDoLivro();
	}

	public void anexaUsuarioAoLivro(Usuario usuario) {
		_usuario = usuario;
	}

	public void desanexaUsuarioDoLivro() {
		anexaUsuarioAoLivro(null);
	}

	public void exibe() {
		System.out.println("\t\t" + "T�tulo: " + "\t\t" + this.getTitulo());
		System.out.println("\t\t" + "Autor: " + "\t\t\t" + this.getAutor());
		System.out.println("\t\t" + "Nr. Cat�logo: " + "\t\t" + this.getNrCatalogo());
		if (getUsuario() != null) System.out.println("\t\t" + "Quem Emprestou: " + "\t" + this.getUsuario());
		System.out.println("\t\t" + "--------------------------------------------" + "\n\n");
	}

	@Override
	public boolean equals(Object obj) {
		return this.compareTo(obj) == 0;
	}

	@Override
	public int compareTo(Object obj) {
		Livro livro = (Livro) obj;
		int livroNrCatalogo = livro.getNrCatalogo();
		int result;
		if (_nrCatalogo < livroNrCatalogo) result = -1;
		else if (_nrCatalogo == livroNrCatalogo) result = 0;
		else result = 1;
		return result;
	}

	@Override
	public int hashCode() {
		@SuppressWarnings("removal")
		Integer integerNrCatalogo = new Integer(_nrCatalogo);
		return integerNrCatalogo.hashCode();
	}

	@Override
	public String toString() {
		return "\"T�tulo: " + getTitulo() + " � Autor: " + getAutor() + "\"";
	}

	public int getNrCatalogo() {
		return _nrCatalogo;
	}

	protected void setNrCatalogo(int nrCatalogo) {
		_nrCatalogo = nrCatalogo;
	}

	public String getTitulo() {
		return _titulo;
	}

	protected void setTitulo(String titulo) {
		_titulo = titulo;
	}

	public Usuario getUsuario() {
		return _usuario;
	}

	public String getAutor() {
		return _autor;
	}

	protected void setAutor(String autor) {
		_autor = autor;
	}

}
