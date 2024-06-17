package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(75.5);
		
		Arroz ingrediente1 = new Arroz(0.3);
		Feijao ingrediente2 = new Feijao(0.18);
		Sorvete sobremesa = new Sorvete(0.500);
		
		System.out.println(pessoa.toString());
		
		pessoa.comer(ingrediente1);
		System.out.println(pessoa.toString());
		
		pessoa.comer(ingrediente2);
		System.out.println(pessoa.toString());

		pessoa.comer(sobremesa);
		System.out.println(pessoa.toString());
	}
}
