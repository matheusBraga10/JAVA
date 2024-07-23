package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import compra.CompraParcelada;

public class TesteCompraParcelada extends TesteCompra {
	
	
	@Test
	public void testeCompraParcelada1() {
		CompraParcelada compraParcelada = new CompraParcelada(500, 1, 0.5);
		assertEquals(750, compraParcelada.total(), 0.1);
	}
	@Test
	public void testeCompraParcelada2() {
		CompraParcelada compraParcelada = new CompraParcelada(500, 2, 0.5);
		assertEquals(1125, compraParcelada.total(), 0.1);
	}
	@Test
	public void testeCompraParcelada5() {
		CompraParcelada compraParcelada = new CompraParcelada(500, 5, 0.5);
		assertEquals(3796.875, compraParcelada.total(), 0.1);
	}
	@Test
	public void testeCompraParcelada10() {
		CompraParcelada compraParcelada = new CompraParcelada(500, 10, 0.5);
		assertEquals(28832.51, compraParcelada.total(), 0.1);
	}

}


