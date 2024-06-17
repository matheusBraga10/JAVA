package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		System.out.println("Digite um valor real: ");
		Scanner entrada = new Scanner(System.in);
		
		double numero = entrada.nextDouble();
		
		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow(numero, 3);
	
		System.out.println(numero + "²= " + quadrado + " e " + numero + "³= " + cubo);
		entrada.close();
		
		
	}
}

