package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculoIMC.Paciente;

public class TesteCalculoIMC {

	@Test
	public void test16() {
		Paciente p = new Paciente(30, 1.75);
		assertEquals(p.calcularIMC(), p.getCalcIMC() , 1.0);
	}
	@Test
	public void test17() {
		Paciente p = new Paciente(50, 1.75);
		assertEquals(p.calcularIMC(), p.getCalcIMC() , 1.0);
	}
	@Test
	public void test18() {
		Paciente p = new Paciente(60, 1.75);
		assertEquals(p.calcularIMC(), p.getCalcIMC() , 1.0);
	}
	@Test
	public void test25() {
		Paciente p = new Paciente(70, 1.75);
		assertEquals(p.calcularIMC(), p.getCalcIMC() , 1.0);
	}
	@Test
	public void test30() {
		Paciente p = new Paciente(80, 1.75);
		assertEquals(p.calcularIMC(), p.getCalcIMC() , 1.0);
	}
	@Test
	public void test35() {
		Paciente p = new Paciente(90, 1.75);
		assertEquals(p.calcularIMC(), p.getCalcIMC() , 1.0);
	}
	@Test
	public void test40() {
		Paciente p = new Paciente(100, 1.75);
		assertEquals(p.calcularIMC(), p.getCalcIMC() , 1.0);
	}
	@Test
	public void test45() {
		Paciente p = new Paciente(130, 1.75);
		assertEquals(p.calcularIMC(), p.getCalcIMC() , 1.0);
	}

}
