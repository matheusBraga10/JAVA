package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana",9.8);
		Aluno a2 = new Aluno("Bia",5.5);
		Aluno a3 = new Aluno("Gui",6.7);
		Aluno a4 = new Aluno("Babi",8.1);
		Aluno a5 = new Aluno("Ana",9.8);
		Aluno a6 = new Aluno("Pedro",5.5);
		Aluno a7 = new Aluno("Gui",7.7);
		Aluno a8 = new Aluno("Maria",8.1);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("Distinct");
		
		alunos.stream()
			.distinct() // Funciona com a implementação do equals e hashCode na class Aluno.java
			.forEach(System.out::println); 
		
		System.out.println("\nSkip / Limit");
		
		alunos.stream()
		.distinct()
		.skip(2) // Pula n elementos iniciais
		.limit(2) // limita apenas n elementos finais
		.forEach(System.out::println);
		
		System.out.println();
		
		alunos.stream()
			.distinct()
			.limit(2) // limita apenas n elementos finais
			.skip(1) // Pula n elementos iniciais
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		
		alunos.stream()
//			.distinct()
			.skip(3)
			.takeWhile(a -> a.nota >= 7) // Pega os elementos até a condição não seja mais satisfeita
			.forEach(System.out::println);
	}
}
