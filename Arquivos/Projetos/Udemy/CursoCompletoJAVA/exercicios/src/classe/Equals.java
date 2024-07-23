package classe;

import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Matheus Felipe";
		u1.email = "matheusfbraga10@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Matheus Felipe";
		u2.email = "matheusfbraga10@gmail.com";
		
		System.out.println(u1 == u2);
		
		System.out.println(u1.nome.equals(u2.nome));
		
		System.out.println(u1.equals(u2)); // Comparação considerada na classe Usuario.java
//		Classe Usuario.java considera para o modelo equals igualdade do .nome e .email
//		Necessário programar esta comparação
		
//		System.out.println(u2.equals(new Date()));
		
	}
}
