package estruturasDeControle;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		int contador = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero para verificar se é primo: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0 ) {
				contador++;
			}
		}
		
		switch (contador) {
		case 0:
			System.out.println("O numero "+ numero +" é um numero primo.");
			break;
		default:
			System.out.println("O numero "+ numero +" não é um numero primo.");
		}
		entrada.close();
	}
}
