package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = valor -> System.out.println(valor.nome + "!!!!");
		
		Produto p1 = new Produto("caneta", 12.34, 0.09);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("lapis", 4.56, 0.025);
		Produto p3 = new Produto("Notebook", 2987.99, 0.03);
		Produto p4 = new Produto("Caderno", 7.80, 0.18);
		Produto p5 = new Produto("borracha", 19.9, 0.19);

		List<Produto> produtos = Arrays.asList(p1, p2 ,p3 ,p4 ,p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
	}
}
