package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class reduce2 {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana",9.8);
		Aluno a2 = new Aluno("Bia",5.5);
		Aluno a3 = new Aluno("Gui",6.7);
		Aluno a4 = new Aluno("Babi",8.1);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
		Function<Aluno, Double> nota = a -> a.nota;
		BinaryOperator<Double> soma = (a, b) -> a + b;
			 
		alunos.stream()
		.filter(aprovado)
		.map(nota)
		.reduce(soma)
		.ifPresent(System.out::println);
		
	}
}
