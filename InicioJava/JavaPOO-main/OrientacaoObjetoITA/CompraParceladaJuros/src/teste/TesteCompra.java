package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import compra.CarrinhoDeCompras;
import compra.Compra;

public class TesteCompra {

	@Test
	public void testeCompraAVista() {
		Compra c = new Compra(500);
		c.getValor();
		assertEquals(500, c.getValor(), 0.1);
	}

	@Test
	public void testeCompraAVistaMaisDe1Item() {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		Compra c = new Compra(500);
		Compra c1 = new Compra(50);
		carrinhoDeCompras.adicionaCompra(c, 1);
		carrinhoDeCompras.adicionaCompra(c1, 1);
		assertEquals(550, carrinhoDeCompras.total(), 0.1);
	}

}
