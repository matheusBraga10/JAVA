package estruturasDeControle;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano de "+ ano +" é bissexto e possui 366 dias.");
		} else {
			System.out.println("O ano de " + ano+" não é bissexto e possui 365 dias.");
		}

		entrada.close();
	}
}
