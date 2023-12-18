package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@bool.com.br");
		Pessoa p2 = new Pessoa(2, "João da Cunha", "joao@bool.com.br");
		Pessoa p3 = new Pessoa(3, "Alfredo de Souza", "alfredo@bool.com.br");
		Pessoa p4 = new Pessoa(4, "Ana Maria", "ana@bool.com.br");
		Pessoa p5 = new Pessoa(5, "Maria da Graça", "maria@bool.com.br");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}

}
