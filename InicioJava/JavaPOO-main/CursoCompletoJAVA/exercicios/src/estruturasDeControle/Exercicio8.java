package estruturasDeControle;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva uma palavra: \n");
		String palavra = entrada.nextLine();
		int nLetras = palavra.length();
		
		for (int i = 0; i < nLetras; i++) {
			System.out.println(palavra.charAt(i)); 
		}

		entrada.close();
	}
}
