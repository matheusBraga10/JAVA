package classe;

public class DJantar {
	public static void main(String[] args) {

		DPessoa p1 = new DPessoa("Matheus",70.5);
		
		DComida c1 = new DComida("Pizza", 0.854);
		DComida c2 = new DComida("Hamburguer", 0.554);
		
		System.out.println(p1.apresenta());
		p1.comer(c2);
		System.out.println(p1.apresenta());
		p1.comer(c1);
		System.out.println(p1.apresenta());
		
	}	
}
	
