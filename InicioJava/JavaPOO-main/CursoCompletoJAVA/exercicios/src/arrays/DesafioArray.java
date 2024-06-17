package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas você quer informar? ");
		int nNotas = entrada.nextInt();
		
		double[] notas = new double[nNotas];
		for (int i = 0; i < nNotas; i++) {
			System.out.printf("Entre com a %d° nota de %d notas: \n", (i+1),  nNotas);
			double nota = entrada.nextDouble();
			notas[i] = nota;
		}
	
		double soma = 0;
		for (double n : notas) {
			soma += n;
		}
		double media = soma/nNotas;
		System.out.println("A média do aluno foi: " + media);
		
		entrada.close();
	}
}
