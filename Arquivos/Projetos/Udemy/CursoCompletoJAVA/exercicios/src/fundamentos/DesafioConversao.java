package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com seu salário do mes de Janeiro: ");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.println("Entre com seu salário do mes de Fevereiro: ");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.println("Entre com seu salário do mes de Março: ");
		String salario3 = entrada.next().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double media = (valor1 + valor2 + valor3)/3;
		
		System.out.printf("A média salarial dos meses declarados foi: R$ %.2f", media);
		
		entrada.close();
	}
}
