package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Matheus","Braga",34);
		
//		pessoa.idade = -30; // Alterar
		
//		System.out.println(pessoa.ida de); // Ler
		
		pessoa.setIdade(-30);
		
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.toString());
		
	}
	
}
