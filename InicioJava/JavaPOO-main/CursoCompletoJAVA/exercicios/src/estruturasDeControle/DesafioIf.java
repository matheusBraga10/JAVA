package estruturasDeControle;

public class DesafioIf {
	public static void main(String[] args) {
		double nota = 1.3;
		
		if(nota>=9.0) {
			System.out.println("Quadro de honra!");
			System.out.println("Você é fera!!!");
		} else if (nota < 9 && nota >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}
}
