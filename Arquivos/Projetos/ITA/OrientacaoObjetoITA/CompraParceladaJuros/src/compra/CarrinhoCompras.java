package compra;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoCompras {

	private Map<Compra, Integer> compras = new HashMap<>();
	
	public void adicionaCompra(Compra compra, int quantidade) {
		if(this.getCompras().containsKey(compra)) {
			this.getCompras().put(compra, this.getCompras().get(compra) + quantidade);
		} else {
			this.getCompras().put(compra, quantidade);
		}
	}

	public double total() {
		double valorTotal = 0;
		for (Compra compra: this.getCompras().keySet()) {
			valorTotal += compra.getValor() * this.getCompras().get(compra);
		}
		return valorTotal;
	}
	public Map<Compra, Integer> getCompras() {
		return compras;
	}

	public void setCompras(Map<Compra, Integer> compras) {
		this.compras = compras;
	}

	
}
