package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valor = 0;
		double total = 0;
		int contador = 0;
		double media = 0;
		
		while (valor != -1) {
			System.out.println("Entre com sua nota: ");
			valor = entrada.nextDouble();
			if (valor >= 0 && valor <= 10) {
				total += valor;
				contador++;
			} else if (valor == -1) {
				System.out.println("\nSaindo do programa!!");
			} else {
				System.out.println("Valor inválido."
						+ "\nDigite um valor entre 0 e 10 para calcular ou"
						+ "\ndigite -1 para sair.");
			}
		} 

		media = total/contador;
		System.out.println("A turma tem " + contador + " alunos");
		System.out.println("A média das notas da turma foi de: " + media);
		System.out.println("O valor total das notas foi de " + total );
		entrada.close();
	}
}
