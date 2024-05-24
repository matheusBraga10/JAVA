package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		c = "Outro texto";
//		c = 4.5; Após declarada a variável com um tipo, esta não poderá trocar de tipo
		System.out.println(c);
		
		double d; //variavel declarada
		d = 123.3456; // variavel inicialzada
		System.out.println(d);
	}
}
