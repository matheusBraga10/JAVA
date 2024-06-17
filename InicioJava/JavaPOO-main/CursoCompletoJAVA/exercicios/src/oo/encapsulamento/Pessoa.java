package oo.encapsulamento;

public class Pessoa {
	
	private String nome, sobrenome;
	private int idade;

	public Pessoa(String nome, String sobrenome, int idade) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade >= 0 && idade <= 120) {
			this.idade = idade;
		} else {
			System.out.println("Idade inválida.");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
}
