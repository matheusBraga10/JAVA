package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//		Declarando o tipo primitivo com letra inicial maiuscula, vira objeto
		Byte b = 100;
		Short s = 1000;
		
		System.out.print("Digite um numero ");
		Integer i = Integer.parseInt(entrada.next());
		Long l = 1000000L;
		Boolean bo = Boolean.parseBoolean("true");
		
		System.out.println(b.byteValue());
		System.out.println(s.toString()); //Transforma "s" em string
		System.out.println(i*5);
		System.out.println(l/3);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
		
		Float f = 123.0f;
		System.out.println(f);
		
		Double d = 1234.54657;
		System.out.println(d);
		
		
		entrada.close();
	}
}
