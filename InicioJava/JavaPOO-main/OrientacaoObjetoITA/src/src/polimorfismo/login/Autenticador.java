package polimorfismo.login;

public class Autenticador {
	
	public Usuario logar(String login, String senha) throws LoginException {
		if("guerra".equals(login) && "senhaDoGuerra".equals(senha)) {
			return new Usuario(login);
		} 
		throw new LoginException("O usuario e a senha não batem!", login);
	}
}
