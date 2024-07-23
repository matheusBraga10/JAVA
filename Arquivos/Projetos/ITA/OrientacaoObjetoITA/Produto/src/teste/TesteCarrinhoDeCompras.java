package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import produto.CarrinhoDeCompras;
import produto.Produto;
import produto.ProdutoComTamanho;

public class TesteCarrinhoDeCompras {

	CarrinhoDeCompras carrinho;
	Produto produto;
	ProdutoComTamanho produtoComTamanho;
	
	@Before
	public void inicializaCarrinho() {
		carrinho = new CarrinhoDeCompras();
		produto = new Produto("Carvão", 3, 15);
		produtoComTamanho = new ProdutoComTamanho("Picanha", 4, 45.7, 5);
	}
	
	@Test
	public void adicionaProduto() {
		carrinho.adicionaProduto(produtoComTamanho, 3);
		carrinho.adicionaProduto(produto, 2);
		assertEquals(((45.7*3) + (15*2)), carrinho.valorTotal(), 0.1);
	}
	@Test
	public void retiraProduto() {
		carrinho.adicionaProduto(produtoComTamanho, 3);
		carrinho.adicionaProduto(produto, 2);
		carrinho.removeProduto(produtoComTamanho, 2);
		carrinho.removeProduto(produto, 2);
		assertEquals(((45.7*1) + (15*0)), carrinho.valorTotal(), 0.1);
	}
	
	@Test
	public void retiraProdutoTodo() {
		carrinho.adicionaProduto(produtoComTamanho, 3);
		carrinho.removeProduto(produtoComTamanho, 3);
		assertEquals(0, carrinho.valorTotal(), 0.1);
	}
	
	
}
