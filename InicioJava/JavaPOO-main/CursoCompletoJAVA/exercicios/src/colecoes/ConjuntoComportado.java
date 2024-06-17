package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
//		Set<String> listaAprovados = new HashSet<>(); // Faz lista de forma desordenada
//		SortedSet<String> listaAprovados = new HashSet<>(); // Faz lista de forma ordenada
		Set<String> listaAprovados = new TreeSet<>(); // TreeSet ordena a lista
//		lista.add(1.2);
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Pedro");
		listaAprovados.add("Lucas");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
			
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (int n : nums) {
			System.out.println(n); 
		}
		
	}
}
