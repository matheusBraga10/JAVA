package fundamentos;

public class OperadoresTernarios {
	public static void main(String[] args) {
		double media = 8.6;
		String resultadoParcial = media >= 3.0 ? "em recuperação." : "reprovado.";
		String resultado = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultado);
		
		double nota = 9.0;
		boolean bomComportamento = true;
		boolean pasouPorMedia = nota >= 7.0;
		boolean temDesconto = bomComportamento && pasouPorMedia;
		String resultado1 = temDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem desconto? " + resultado1);
	}
}
