package estruturasDeControle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Digite o dia da semana:");
		
		
		if ("domingo".equals(dia)) {
			System.out.println("dia = 1");
		} else if ("segunda".equals(dia)) {
			System.out.println("dia = 2");
		} else if ("terça".equals(dia)) {
			System.out.println("dia = 3");
		} else if ("quarta".equals(dia)) {
			System.out.println("dia = 4");
		} else if ("quinta".equals(dia)) {
			System.out.println("dia = 5");
		} else if ("sexta".equals(dia)) {
			System.out.println("dia = 6");
		} else if ("sabado".equals(dia)) {
			System.out.println("dia = 7");
		} else {
			System.out.println("Dia inválido ");
		}
	}
}
