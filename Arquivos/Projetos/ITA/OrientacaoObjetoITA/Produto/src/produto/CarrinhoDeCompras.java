package produto;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	
	private Map<Produto, Integer> produtos = new HashMap<>();
	
	public void adicionaProduto(Produto produto, int quantidade) {
		if(this.getProdutos().containsKey(produto)) {
			this.getProdutos().put(produto, this.getProdutos().get(produto) + quantidade);
		} else {
			this.getProdutos().put(produto, quantidade);
		}
	}
	
	public void removeProduto(Produto produto, int quantidade) {
		if((this.getProdutos().containsKey(produto)) && (this.getProdutos().get(produto) > quantidade)) {
			this.getProdutos().put(produto, this.getProdutos().get(produto) - quantidade);
		} else {
			this.getProdutos().remove(produto);
		}
	}
	
	public double valorTotal() {
		double valorTotal = 0;
		for(Produto produto : this.getProdutos().keySet()) {
			valorTotal += produto.getPreco() * this.getProdutos().get(produto);
		}
		return valorTotal;
	}
	
	public Map<Produto, Integer> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(Map<Produto, Integer> produtos) {
		this.produtos = produtos;
	}
}
