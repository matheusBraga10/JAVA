package generics;

import java.util.TreeSet;

public class ComparableTeste {
	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		
		numeros.add(10);
		numeros.add(1);
		numeros.add(3);
		numeros.add(6);
		numeros.add(8);
		numeros.add(123);
		numeros.add(-13);
		
		for (Integer n : numeros) {
			System.out.println(n);
		} //Os inteiros implementam o conceito de comparação do menor para o maior automaticamente
	}
}
