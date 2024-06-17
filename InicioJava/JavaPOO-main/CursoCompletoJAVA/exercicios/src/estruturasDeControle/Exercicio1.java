package estruturasDeControle;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		double valor = entrada.nextDouble();
		
		if(valor > 0 && valor < 10) {
			System.out.print("O numero " + valor + " está entre 0 e 10,");
			if (valor % 2 == 0) {
				System.out.println(" e é Par!");
			} else {
				System.out.println(" e é Ímpar!");
			}
		}else {
			System.out.println("O numero " + valor + " não está entre 0 e 10.");
		}

		entrada.close();
	}
	
}
