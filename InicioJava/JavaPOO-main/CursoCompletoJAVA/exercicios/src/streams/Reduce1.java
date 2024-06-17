package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;
		
		Integer total1 = numeros.stream().reduce(soma).get();
		System.out.println(total1);

		Integer total2 = numeros.parallelStream().reduce(0, soma);
		System.out.println(total2);
		
		Integer total3 = numeros.stream().reduce(100, soma);
		System.out.println(total3);
		Integer total4 = numeros.parallelStream().reduce(100, soma);
		System.out.println(total4); // parallelStream() executa fazendo a chamada das 2 variaveis de reduce() toda vez
		
		
		numeros.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		
	}
}
