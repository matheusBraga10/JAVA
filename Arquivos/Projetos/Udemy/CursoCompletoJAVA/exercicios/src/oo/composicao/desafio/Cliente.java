package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<>();
 	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	void addCompra(Compra compra) {
		this.compras.add(compra); 
	}
	
	double totalCompraCliente() {
		double total = 0;
		
		for (Compra compra : compras) {
			total+= compra.totalCompra();
		}
		return total;
	}

}
