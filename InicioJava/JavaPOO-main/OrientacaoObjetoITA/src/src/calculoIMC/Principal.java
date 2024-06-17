package calculoIMC;

public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(80.5, 1.78);
		Paciente p2 = new Paciente(180.2, 1.58);
		Paciente p3 = new Paciente(50.1, 1.88);
		
		p1.calcularIMC();
		p1.diagnostico();
		System.out.println("O diagnostico do paciente 1 é " +p1.diagnostico());
		System.out.println("O calculo do IMC é " +p1.calcularIMC());
		System.out.println();

		p2.calcularIMC();
		p2.diagnostico();
		System.out.println("O diagnostico do paciente 2 é " +p2.diagnostico());
		System.out.println("O calculo do IMC é " +p2.calcularIMC());
		System.out.println();
		
		p3.calcularIMC();
		p3.diagnostico();
		System.out.println("O diagnostico do paciente 3 é " +p3.diagnostico());
		System.out.println("O calculo do IMC é " +p3.calcularIMC());
		System.out.println();
		
	}

}
