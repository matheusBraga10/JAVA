package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import banco.ContaCorrente;

public class TesteContaCorrente {
	
	ContaCorrente cc;
	
	@Before
	public void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}
	
	@Test
	public void deposito() {
		assertEquals(200, cc.getSaldo());
	}
	@Test
	public void saque() {
		int valorSacado = cc.sacar(120);
		assertEquals(80, cc.getSaldo());
		assertEquals(120, valorSacado);
	}
	@Test
	public void saqueMaiorQueSaldo() {
		int valorSacado = cc.sacar(250);
		assertEquals(200, cc.getSaldo());
		assertEquals(0, valorSacado);
	}

}
