package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<ItemCarrinho> itens = new ArrayList<>();
	
	void addItem(Produto produto, int quantidade) {
		this.itens.add(new ItemCarrinho(produto, quantidade));
	}
	
	void addItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new ItemCarrinho(produto, quantidade));
	}
	
	double totalCompra() {
		double total = 0;
		for (ItemCarrinho itemCarrinho : itens) {
			total += itemCarrinho.quantidade * itemCarrinho.produto.preco;
		}
		
		return total;
	}
}
