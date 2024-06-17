package lambdas;

import java.util.function.BiFunction;

public class Desafio { 
	public static void main(String[] args) {
		
		Produto produto = new Produto("iPad", 3235.89, 0.13);
		
		BiFunction<Double, Double, Double> precoDesconto = (n1 , n2) 
				-> (n1 *(1 - n2));
		double desconto = precoDesconto.apply(produto.preco, produto.desconto);
		BiFunction<Double, Double, Double> precoImposto = (n1, n2) 
				-> (n1 *(1 - n2))>= 2500 ? (desconto * 1.085) : desconto;
		double imposto = precoImposto.apply(produto.preco, produto.desconto);
		BiFunction<Double, Double, Double> frete = (n1, n2) 
				-> n1  >= 3000 ? (n1 + 100) : (n1 + 50);
		double precoFinal = frete.apply(imposto, null);
		

		System.out.printf("O %S está saindo a R$: %.2f", produto.nome, desconto);
		System.out.printf("\nCom o imposto vai de R$: %.2f para R$: %.2f", desconto, imposto);		
		System.out.printf("\nCom o frente vai de R$: %.2f para R$: %.2f", imposto, precoFinal);		
	}
}
