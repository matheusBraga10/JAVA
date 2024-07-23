package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import produto.Produto;

public class TesteProduto {

	Produto p1;
	Produto p2;
	
	@Before
	public void inicializaProduto() {
		p1 = new Produto("Arroz", 1, 11.7);
		p2 = new Produto("Feijão", 2, 17.3);
	}
	
	@Test
	public void testeProdutoCodigo() {
		assertEquals(1, p1.getCodigo());
		assertEquals(2, p2.getCodigo());
	}
	@Test
	public void testeProdutoPreco() {
		assertEquals(11.7, p1.getPreco(), 0.5);
		assertEquals(17.3, p2.getPreco(), 0.5);
	}
}
