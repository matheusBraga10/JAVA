package fundamentos;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da altura: ");
		double a = entrada.nextDouble();
		
		System.out.println("Digite  valor da base: ");
		double b = entrada.nextDouble();

		double area = a*b/2;
		
		System.out.println("O triângulo de base " + b + " e altura " + a + "tem sua \nárea equivalente a " + area);
		
		entrada.close();
	}
}
