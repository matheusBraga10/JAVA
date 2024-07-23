package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.itens.add(new Item("Caderno",3,18.79));
		compra1.adicionarItem("Caneta",20,7.45); // Com relação bidirecional adicionarItem 
		compra1.adicionarItem(new Item("Borracha",12,3.89));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
//		Só pra mostrar a relação bidirecional
		double total = compra1.itens.get(1).compra
				.itens.get(2).compra.obterValorTotal();
		System.out.println("O total é R$ " + total);
	}
}
