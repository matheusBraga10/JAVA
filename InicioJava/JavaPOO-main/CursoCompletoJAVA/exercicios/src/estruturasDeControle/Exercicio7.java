package estruturasDeControle;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Para obter a soma:\nPara sair do programa digite\nqualquer valor neativo \n");
		double valor1, valor2;
		do {
			System.out.println("Entre com um valor ");
			valor1 = entrada.nextDouble();
			System.out.println("Entre com um valor ");
			valor2 = entrada.nextDouble();
			
			double resultado = valor1 + valor2; 
			System.out.printf("%.2f + %.2f = %.2f\n", valor1, valor2, resultado);
			
		} while(valor1 > 0 && valor2 > 0);
		System.out.println("FIM!");

		entrada.close();
	}
}
