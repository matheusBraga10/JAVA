package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		/*
		 * Ler num1 
		 * Ler num2
		 * + - * / %
		 * 
		 */
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor3 = JOptionPane.showInputDialog("Qual operação você deseja fazer?: \nSoma= +\nSubtração= -\nMultiplicação= *\nDivisão= /\nResto da divisão= %");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		double x = Double.parseDouble(valor1);
		double y = Double.parseDouble(valor2);
		
		double soma = x + y;
		double sub = x - y;
		double mult = x * y;
		double div = x / y;
		double restoDiv = x % y;
		
		double opSoma = valor3.equals("+") ? soma : 0;
		double opSub = valor3.equals("-") ? sub : opSoma;
		double opMult = valor3.equals("*") ? mult : opSub;
		double opDiv = valor3.equals("/") ? div : opMult;
		double opRDiv = valor3.equals("%") ? restoDiv : opDiv;
		
		System.out.println("Calculando... \n" + x + " " + valor3+ " " + y + " = " + opRDiv);
	}
}
