package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import banco.ContaEspecial;

public class TesteContaEspecial extends TesteContaCorrente {

	@Before
	public void inicializaConta() {
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}
	@Test
	public void saqueMaiorQueSaldo() {
		int valorSacado = cc.sacar(350);
		assertEquals(200, cc.getSaldo());
		assertEquals(0, valorSacado);
	}
	
	@Test
	public void saqueMaiorQueSaldoDentroDoLimite() {
		int valorSacado = cc.sacar(250);
		assertEquals(-50, cc.getSaldo());
		assertEquals(250, valorSacado);
	}
	
}
