package excecao.personalizadaA;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;

		try {
			imprimirNomeAluno(a1); // Exceção por objeto de valor nulo
		} catch	(Exception excecao) {
			System.out.println("Ocorreu um erro no momento\nde imprimir o nome do usuário");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("Ocorreu o erro " + e.getMessage());
		} // Exceção por erro aritmetico
		
		System.out.println("Fim :)"); // Interrupção abrupta do código, impedindo impressão
	}
	
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
