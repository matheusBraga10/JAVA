package estruturasDeControle;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o maior valor: ");
		int valor1 = entrada.nextInt();
		System.out.println("Informe o menor valor: ");
		int valor2 = entrada.nextInt();
		System.out.println("Informe o valor do passo: ");
		int passo = entrada.nextInt();
		
		for (int i = valor1; i >= valor2; i-=passo ) {
			System.out.println(i);
		}
		entrada.close();
	}
}
