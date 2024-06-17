package pizzaria;

import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();

		p1.adicionarIngrediente("Tomate", 1);
        p1.adicionarIngrediente("Queijo", 1);
        p1.adicionarIngrediente("Mangericão", 1);

        p2.adicionarIngrediente("Queijo", 1);

        p3.adicionarIngrediente("Tomate", 1);
        p3.adicionarIngrediente("Pimentão", 1);
        p3.adicionarIngrediente("Queijo", 1);
        p3.adicionarIngrediente("Ovo", 1);
        p3.adicionarIngrediente("Frango", 1);
        p3.adicionarIngrediente("Borda", 1);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(p1);
        carrinho.adicionaPizza(p2);
        carrinho.adicionaPizza(p3);

        System.out.println("");
        System.out.println("Lista dos ingredientes e quantidades utilizadas");
        System.out.println("-----------------------------------------------");
        for(Map.Entry<String, Integer> entry : carrinho.getIngredientes().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Valor do preço total do carrinho de compras: R$: %.2f \n", carrinho.getTotalPreco());
	}

}
