package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Matheus"); 

		Compra compra1 = new Compra();
		compra1.addItem("Caneta", 9.67,50);
		compra1.addItem(new Produto("Notebook", 1897.88), 2);
		
		Compra compra2 = new Compra ();
		compra2.addItem("Caderno", 10, 10);
		compra2.addItem(new Produto("Impressora", 998.88),1);
		
		cliente.compras.add(compra1);
		cliente.addCompra(compra2);
		
		System.out.println(cliente.totalCompraCliente());
		
	}
}