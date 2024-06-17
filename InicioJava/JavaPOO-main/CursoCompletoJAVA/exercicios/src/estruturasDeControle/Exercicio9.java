package estruturasDeControle;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int maiorValor = 0;
		int i = 0;
		
		do {
			System.out.println("Digite um numero: ");
			int valor = entrada.nextInt();
			
			if (valor>maiorValor) {
				maiorValor = valor;
			}
			i++;
		} while(i<10);
		
		System.out.println("O maior valor foi: "+ maiorValor);
		
		entrada.close();
	}
}