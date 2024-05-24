package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno("Ana", 7.8);
		Aluno aluno02 = new Aluno("Bia", 5.8);
		Aluno aluno03 = new Aluno("Gui", 9.8);
		Aluno aluno04 = new Aluno("Daniel", 6.8);
		Aluno aluno05 = new Aluno("Rebeca", 7.1);
		Aluno aluno06 = new Aluno("Pedro", 8.8);
		
		List<Aluno> alunos = Arrays.asList(aluno01, aluno02, aluno03, aluno04, aluno05, aluno06);
		
//		alunos.stream()
//		.filter(aluno -> aluno.nota >= 7.0)
//		.map(aluno -> "Parabens, " + aluno.nome + "! Você está aprovado!\nSua nota foi: " + aluno.nota)
//		.forEach(System.out::println);
		
		Predicate<Aluno> aprovado = a-> a.nota >= 7.0;
		Function<Aluno, String> saudacaoAprovacao = a-> "Parabens, " +
				a.nome + "! Você está aprovado!\nSua nota foi: " + a.nota;
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovacao)
			.forEach(System.out::println);
		
	}
}
