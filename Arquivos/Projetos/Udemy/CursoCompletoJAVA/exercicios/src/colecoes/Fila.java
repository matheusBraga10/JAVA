package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // Lanca uma exceção
		fila.offer("Bia"); // Retorna falso
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter o proximo elemento da fila (sem remover)
		// Diferença do comportamento ocorre quando a fila está vazia!
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.peek()); // Lanca uma exceção
		System.out.println(fila.element());
		System.out.println(fila.element());
		
//		poll e remove -> obtem o proximo elemento da fila e remove!
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains();
		 
	}
}
