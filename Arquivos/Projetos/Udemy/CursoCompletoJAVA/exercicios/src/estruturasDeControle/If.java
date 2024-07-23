package estruturasDeControle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if (media >= 7.0 && media <= 10) {
			System.out.println("Aprovado!");
			System.out.println("Paranbéns!");
		} else if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado!");
		} 
		entrada.close();
	}
}
 