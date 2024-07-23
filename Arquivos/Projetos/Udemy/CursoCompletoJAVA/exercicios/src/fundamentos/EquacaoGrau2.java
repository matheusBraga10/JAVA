package fundamentos;

import java.util.Scanner;

public class EquacaoGrau2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a: ");
		double a = entrada.nextDouble();
		
		System.out.println("Entre com o valor de b: ");
		double b = entrada.nextDouble();
		
		System.out.println("Entre com o valor de c: ");
		double c = entrada.nextDouble();
		
		double bhaskaraNeg = (-b*(Math.pow((Math.pow(b, 2)-4*a*c), (1/2))))/(2*a);
		double bhaskaraPos = (b*(Math.pow((Math.pow(b, 2)-4*a*c), (1/2))))/(2*a);
		
		System.out.println("(" + a + "X²) + (" + b + "X) + (" + c + ") = " + bhaskaraNeg + " ou " + bhaskaraPos);
	}
}
