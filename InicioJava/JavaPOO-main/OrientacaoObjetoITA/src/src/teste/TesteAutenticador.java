package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import polimorfismo.login.Autenticador;
import polimorfismo.login.LoginException;
import polimorfismo.login.Usuario;

public class TesteAutenticador {

	@Test
	public void testeLoginComSucesso() throws LoginException {
		Autenticador autenticador = new Autenticador();
		Usuario usuario = autenticador.logar("guerra", "senhaDoGuerra");
		assertEquals("guerra", usuario.getLogin());
	}
	@Test(expected = LoginException.class)
	public void testeLoginComFalha() throws LoginException {
		Autenticador autenticador = new Autenticador();
		Usuario usuario = autenticador.logar("guerra", "senhaErradaDoGuerra");
		assertEquals("guerra", usuario.getLogin());
	}
	@Test
	public void testeInformacaoDoErro() {
		Autenticador autenticador = new Autenticador();
		Usuario usuario;
		try {
			usuario = autenticador.logar("guerra", "senhaErradaDoGuerra");
			fail();
		} catch (LoginException e) {
			assertEquals("guerra", e.getLogin());
		}
	}
}
