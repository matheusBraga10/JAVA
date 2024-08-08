package ComponenteDeGamificacao.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ComponenteDeGamificacao.componente.Placar;

public class TesteArmazenamento {

	Placar placar;
	
	@Test
	public void testArmazenarResultado() {
		placar = new Placar();
		assertEquals("O usuário Matheus recebeu 10 pontos do tipo estrela", Placar.regitraPontosUsuario("Matheus", 10, "estrela"));
	}

	@Test
	public void testRecuperar() {
		placar = new Placar();
		assertEquals("O usuário Matheus tem 10 pontos do tipo estrela", Placar.retornaPontosUsuario("Matheus"));
	}

}
