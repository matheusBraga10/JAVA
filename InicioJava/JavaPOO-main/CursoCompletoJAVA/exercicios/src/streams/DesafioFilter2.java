package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	public static void main(String[] args) {
	
		Consumer<String> print = System.out::println;
		
		ProdutosSite p0 = new ProdutosSite("Notebook", 5699.98, 0.35, true);
		ProdutosSite p1 = new ProdutosSite("TV 72\"", 4579.98, 0.45, false);
		ProdutosSite p2 = new ProdutosSite("Home-theater", 799.98, 0.05, true);
		ProdutosSite p3 = new ProdutosSite("Nintendo Wii", 399.98, 0.15, false);
		ProdutosSite p4 = new ProdutosSite("Som master", 1564.98, 0.3, true);
		ProdutosSite p5 = new ProdutosSite("Violão raro", 45688.98, 0.07, false);
		ProdutosSite p6 = new ProdutosSite("Luminária luxo", 522.98, 0.31, true);
		ProdutosSite p7 = new ProdutosSite("Livro raro", 236.98, 0.25, false);
		ProdutosSite p8 = new ProdutosSite("Escultura unica", 456.98, 0.17, true);
		ProdutosSite p9 = new ProdutosSite("Desktop", 741.98, 0.29, false);
		
		List<ProdutosSite> produtos = Arrays.asList(p0,p1,p2,p3,p4,p5,p6,p7,p8,p9);
		
		Predicate<ProdutosSite> desc = p -> p.desconto >= 0.3;
		Predicate<ProdutosSite> frete = p -> p.freteGratis == true;
		
		Function<ProdutosSite, String> noticia = p -> String.format("Super promoção!!!"
			+ "\nO produto %s \nse encontra em desconto de %.1f%%"
			+ "\nsaindo de R$: %.2f a R$: %.2f"
			+ " e \ncom frete grátis\n", p.nome, p.desconto*100.0, p.preco, p.preco*(1.0-p.desconto));
	
		produtos.stream().filter(desc).filter(frete).map(noticia).forEach(print);
		
	}
}