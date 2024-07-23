package modelagemCRC;

public class SistemaAutomacaoBiblioteca {
	public void registraUsuario(String nome) throws UsuarioJaRegistradoException, UsuarioComNomeVazioException, UsuarioInexistenteException {
		if(nome != null){
			if(!nome.isEmpty()) {
				Usuario usuario = new Usuario(nome);
				if(!_usuarios.contains(usuario)) {
					_usuarios.add(usuario);
				} else {
					throw new UsuarioRegistradoException("--->Já existe usuário com o nome \""
							+ nome + "\"! Use outro nome!");
				}
			} else {
				throw new UsuarioComNomeVazioException("--->Não pode registrar usuario com nome vazio!");
			}
		} else {
			throw new UsuarioInexistenteException("--->Não pode registrar usuario inexistente!");
		}
	}
}

