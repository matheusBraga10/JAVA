package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import carro.CarroMult;

public class TestesCarroMult {

	CarroMult c;
	
	@Before
	public void inicializaCarro() {
		c = new CarroMult(100, 1.5, "teste");
	}
	
	@Test
	public void testAcelerarUmaVez() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	@Test
	public void testAcelerarDuasVezes() {
		c.acelerar();
		c.acelerar();
		assertEquals(15, c.getVelocidade());
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
