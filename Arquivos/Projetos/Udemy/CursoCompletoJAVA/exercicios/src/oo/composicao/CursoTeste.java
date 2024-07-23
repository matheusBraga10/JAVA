package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("HTML");
		Curso curso3 = new Curso("Python");
		
		curso1.adicionarAluno(aluno3);
		curso1.adicionarAluno(aluno1);
		
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno1);
		
		curso3.adicionarAluno(aluno3);
		curso3.adicionarAluno(aluno2);
		
		for (Aluno aluno : curso1.alunos) {
			System.out.println("Curso " + curso1.nome + " aluno " + aluno.nome);
		} System.out.println();
		for (Aluno aluno : curso2.alunos) {
			System.out.println("Curso " + curso2.nome + " aluno " + aluno.nome);
		} System.out.println();
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Curso " + curso3.nome + " aluno " + aluno.nome);
		} System.out.println();
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
