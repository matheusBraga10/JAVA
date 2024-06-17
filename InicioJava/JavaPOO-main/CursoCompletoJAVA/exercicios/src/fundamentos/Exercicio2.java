package fundamentos;

public class Exercicio2 {
	public static void main(String[] args) {
		double a = 1.78;
		double p = 75.1;
		
		double imc = p / (a*a);
		String obeso2= imc <= 39.9 ? "Obesidade alta" : "Obesidade morbida";
		String obeso= imc <= 34.9 ? "Obesidade leve" : obeso2;
		String sobrepeso= imc <= 29.9 ? "Sobrepeso" : obeso;
		String normal = imc <= 24.9? "Normal" : sobrepeso;
		String resultado = imc <= 18.5 ? "Magreza" : normal; 
		
		System.out.println("Seu IMC é: " + imc);
		System.out.println(resultado);
	}
}
