package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Operações Built (construtores) - forma que temos de criar Streams
 * Operações Intermediarias - funções facilmente encadeadas
 * Operações Terminais - operações que pode gerar algo diferente de uma stream finalizando o processo.
 */

/*
 * Tipos de Streams
 * Ordenadas 
 * Não ordenadas
 * Sequenciais 
 * Paralelas - desempenho maior
 */

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu","Gui","Luka","Ana");
		
		System.out.println("Usando 'For' tradicional");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nUsando 'Foreach'");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando 'Iterator'");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando 'Stream'");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno!!
	}
}
