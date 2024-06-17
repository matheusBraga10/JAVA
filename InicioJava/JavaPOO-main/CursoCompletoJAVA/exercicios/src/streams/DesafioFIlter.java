package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFIlter {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Matheus", 8.5);
		Aluno a2 = new Aluno("Roberta", 3.4);
		Aluno a3 = new Aluno("Julia", 10);
		Aluno a4 = new Aluno("João", 9.4);
		Aluno a5 = new Aluno("Jorge", 5.6);
		Aluno a6 = new Aluno("Maria", 4.2);
		Aluno a7 = new Aluno("Ana", 8.9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4,a5,a6,a7);
		
		Predicate<Aluno> aprovado = a-> a.nota >= 7.0;
		Predicate<Aluno> honra = a-> a.nota > 9.5;
		
		
		Function<Aluno, String> aprovacao = a -> String.format("Parabéns, %s!"
				+ "\nVocê foi aprovado com %.1f pts em 10!", a.nome , a.nota);
		Function<Aluno, String> honraria = a -> String.format("%s sua nota foi digna de medalha,"
				+ " e você se formou com honras!", a.nome);
	
		alunos.stream()
			.filter(aprovado)
			.map(aprovacao)
			.forEach(System.out::println);
		
		alunos.stream()
			.filter(honra)
			.map(honraria)
			.forEach(System.out::println);
	}
}
