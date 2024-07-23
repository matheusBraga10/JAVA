package estruturasDeControle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 10;
		Random aleatorio = new Random();
		int sorte = aleatorio.nextInt(100);
		
		do {
			i--;
			System.out.println("Digite um numero para\nadivinhar, entre 0 a 100: ");
			int numero = entrada.nextInt();
			
			if (numero == sorte) {
				System.out.println("Parabens! Você adivinhou!\n" + numero + " é o numero sorteado.");
				break;
			} else {
				System.out.println("Tente novamente. Você ainda tem " + i +" tentativas.");
				if (numero > sorte) {
					System.out.println("O número inserido é maior que o armazenado");
				} else {
					System.out.println("O número inserido é menor que o armazenado");
						
				}
			}
		} while (i > 0);
		System.out.println("FIM!");
		entrada.close();
	}
}
