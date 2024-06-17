package streams;

public class MediaTeste {
	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(9.3).adicionar(6.7); // metodo retorna "Media" (a propria classe)
		Media m2 = new Media().adicionar(7.9).adicionar(6.6); // metodo retorna "Media" (a propria classe)
//		m1.adicionar(9.3);
//		m1.adicionar(6.7);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		System.out.println();
		
		double mediaFinal = Media.combinar(m1, m2).getValor();
		System.out.println(mediaFinal);
		
	}
}
