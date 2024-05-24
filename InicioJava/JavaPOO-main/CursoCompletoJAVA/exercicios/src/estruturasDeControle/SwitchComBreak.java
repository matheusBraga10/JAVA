package estruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		String conceito = "";
		System.out.println("Entre com o valor da nota: ");
		Scanner entrada = new Scanner(System.in);

		int nota = entrada.nextInt();

		
		switch(nota) {
		case 10:
			conceito = "A";
			break;
		 case 9:
			conceito = "B";
			break;
		 case 7:
			conceito = "C";
			break;
		 case 6:
			conceito = "D";
			break;
		 case 5:
			conceito = "E";
			break;
		 case 4: case 3: case 2: case 1:
			conceito = "F";
			break;
		 default:
			 conceito = "Não encontrado";
			 break;
		}	
		System.out.println(conceito);
		entrada.close();
	}
}
