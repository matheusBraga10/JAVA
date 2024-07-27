package HandsOn.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import HandsOn.carrinhoDeCompras.CarrinhoDeCompas;
import HandsOn.carrinhoDeCompras.Produto;

public class TesteCarrinhoDeCompras {

	@Test
	public void test() {
		CarrinhoDeCompas c = new CarrinhoDeCompas();
		
		c.adicionaProduto(new Produto("tenis", 100));
		c.adicionaProduto(new Produto("camiseta", 50));
		c.adicionaProduto(new Produto("bermuda", 70));
		
		assertEquals(220, c.total());
	}
	
	@Test
	public void escutaAdicaoDeProduto() {
		CarrinhoDeCompas c = new CarrinhoDeCompas();
		MockObservadorCarrinho mock = new MockObservadorCarrinho();
		c.adicionarObservador(mock);
		c.adicionaProduto(new Produto("tenis", 100));
		mock.verificaRecebimentoProduto("tenis", 100);
	}
	
	@Test
	public void adcionarDoisObservadores() {
		CarrinhoDeCompas c = new CarrinhoDeCompas();
		MockObservadorCarrinho mock1 = new MockObservadorCarrinho();
		MockObservadorCarrinho mock2 = new MockObservadorCarrinho();
		c.adicionarObservador(mock1);
		c.adicionarObservador(mock2);
		c.adicionaProduto(new Produto("tenis", 100));
		mock1.verificaRecebimentoProduto("tenis", 100);
		mock2.verificaRecebimentoProduto("tenis", 100);
	}

	@Test
	public void continuaNotificandocomErroEmObservador() {
		CarrinhoDeCompas c = new CarrinhoDeCompas();
		MockObservadorCarrinho mock1 = new MockObservadorCarrinho();
		MockObservadorCarrinho mock2 = new MockObservadorCarrinho();
		MockObservadorCarrinho mock3 = new MockObservadorCarrinho();
		mock2.queroQueVoceDePau();
		c.adicionarObservador(mock1);
		c.adicionarObservador(mock2);
		c.adicionarObservador(mock3);
		c.adicionaProduto(new Produto("tenis", 100));
		mock1.verificaRecebimentoProduto("tenis", 100);
		mock3.verificaRecebimentoProduto("tenis", 100);
	}
	

}
