package estruturasDeControle;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o valor da nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Entre com o valor da nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
		if (media > 10.0 && media < 0.0) {
			System.out.println("Valor inconsistente.");
		} else if (media >= 7.0) {
			System.out.println("Aprovado! Nota fina: " + media);
		} else if (media >= 4.0) {
			System.out.println("Recuperação. Nota fina: " + media);
		} else {
			System.out.println("Reprovado. Nota fina: " + media);
		}

		entrada.close();
	}
}
