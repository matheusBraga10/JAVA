package estaticaVsInstancia;

public class Principal {

	public static void main(String[] args) {
		
		Somador s1 = new Somador();
		Somador s2 = new Somador();
		Somador s3 = new Somador();

		s1.nome = "Somador 1";
		s2.nome = "Somador 2";
		s3.nome = "Somador 3";
		
		for(int i=0; i<3; i++) {
			s1.somar();
			s2.somar();
			s3.somar();
		}
		s2.somar();
		
		s1.imprimir();
		s2.imprimir();
		s3.imprimir();
		
		/*
		 * Variáveis de instância operam individualmente
		 * Variáveis estáticas operam em todo o conjunto de forma igual
		 * 
		 * Ou seja, na soma, as variaveis de instância somam somente o objeto chamado
		 * Já nas estáticas, somam o objetochamado e todos os outros juntos
		 * */
	}

}
