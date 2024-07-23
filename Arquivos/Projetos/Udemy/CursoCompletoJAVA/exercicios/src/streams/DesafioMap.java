package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/*
 * 1. Número para string binária... 6 => "110"
 * 2. Inverter a string... "110" => "011"
 * 3. Converter de volta para inteiro => "011" => 3	
 */

public class DesafioMap {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		Consumer<Integer> printI = System.out::println;
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Function<Integer, String> binarios = n -> Integer.toBinaryString(n);
		System.out.println("Decimais para binários");
		numeros.stream().map(binarios).forEach(print);
		
		System.out.println("\nBinários invertidos");
		List<String >binariosString = numeros.stream().map(binarios).toList();
		Function<String, String> inverso = n -> new StringBuilder(n).reverse().toString();
		binariosString.stream().map(inverso).forEach(print);
		
		
		System.out.println("\nBinários invertidos para decimais");
		List<String >decimaisInvertidos = binariosString.stream().map(inverso).toList();
		Function<String, Integer> novoDecimal = n -> Integer.parseInt(n, 2);
		decimaisInvertidos.stream().map(novoDecimal).forEach(printI);
		
	}
}
