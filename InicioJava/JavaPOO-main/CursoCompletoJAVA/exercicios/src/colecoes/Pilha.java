package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<>();
		
		pilha.add("O pequeno principe");
		pilha.push("Don Quixote");
		pilha.push("O Hobbit");
		
		System.out.println(pilha.peek());
		System.out.println(pilha.element());
		System.out.println();
		
		for (String livro : pilha) {
			System.out.println(livro);
		}
		
		System.out.println();
		System.out.println(pilha.pop());
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());
//		System.out.println(pilha.remove());
		
//		pilha.size();
//		pilha.clear();
//		pilha.contains();
//		pilha.isEmpty();
		
	}
}
