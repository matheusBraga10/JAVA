package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import carro.CarroSoma;

public class TesteCarroSoma {

	CarroSoma c;
	
	@Before
	public void inicializaCarro() {
		c = new CarroSoma(10, 100, "teste");
	}
	
	@Test
	public void testAcelerar() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}

	@Test
	public void testCarroParado() {
		assertEquals(0, c.getVelocidade());
	}

	@Test
	public void testFrear() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	@Test
	public void testFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
	@Test
	public void testAcelerarAteVelocidadeMaxima() {
		for(int i=0; i < c.getVelocidadeMaxima(); i++) {
			c.acelerar();
		}
		assertEquals(100, c.getVelocidade());
	}

}
