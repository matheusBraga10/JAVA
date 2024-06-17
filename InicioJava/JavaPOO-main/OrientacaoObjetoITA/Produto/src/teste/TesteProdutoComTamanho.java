package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import produto.ProdutoComTamanho;

public class TesteProdutoComTamanho {

	ProdutoComTamanho pct;
	
	@Before
	public void inicializaProduto() {
		pct = new ProdutoComTamanho("Feijão", 2, 17.3, 5);
	}
	@Test
	public void testeProdutoCodigo() {
		assertEquals(2, pct.getCodigo());
	}
	@Test
	public void testeProdutoPreco() {
		assertEquals(17.3, pct.getPreco(), 0.5);
	}
	@Test
	public void testeProdutoTamanho() {
		assertEquals(5, pct.getTamanho(), 0.1);
	}


}
