package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	
	
	public Aluno(String nome) { // Construtor
		this.nome = nome;
	}



	void adicionarCurso(Curso curso) { 
		this.cursos.add(curso); // add curso
		curso.alunos.add(this); // add relação curso com o aluno
	}

	Curso obterCursoPorNome(String nome) { // Método para procurar curso
		Curso procurado = null; 
		for (Curso curso : this.cursos) { // Percorre curso
			if(curso.nome.equalsIgnoreCase(nome)) { // caso o nome seja igual
				return curso; // Retorne nome do curso
			}
		}
		return null; // caso não, retorne nulo
	}

	public String toString() { // Método para retornar o objeto como string
		return "Aluno [nome=" + nome + "]";
	} 
	
	
}
