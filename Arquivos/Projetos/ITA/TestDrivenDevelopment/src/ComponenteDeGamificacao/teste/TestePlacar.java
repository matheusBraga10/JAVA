package ComponenteDeGamificacao.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ComponenteDeGamificacao.componente.Armazenamento;
import ComponenteDeGamificacao.componente.Placar;
import ComponenteDeGamificacao.componente.Usuario;

public class TestePlacar {

	Usuario usuario;
	Armazenamento armazenamento;
	Placar placar;
	
	@Before
	public void carregaDados() {
		placar = new Placar();
		usuario = new Usuario("Matheus");
		armazenamento = new Armazenamento();
	}
	
	@Test
	public void testRegistroPlacar() {
		armazenamento.armazenaDado(usuario, "estrela", 10);
		assertEquals("O usuário [Matheus] recebeu 10 pontos do tipo [estrela]", placar.registraPontosUsuario(armazenamento));
	}

	@Test
	public void testRecuperarPlacar() {
		armazenamento.armazenaDado(usuario, "estrela", 10);
		assertEquals("O usuário Matheus tem 10 pontos do tipo estrela", placar.retornaPontosUsuario());
	}
}
