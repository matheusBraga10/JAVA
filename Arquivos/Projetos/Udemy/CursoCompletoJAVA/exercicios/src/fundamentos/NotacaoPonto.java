package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Matheus");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Matheus".toUpperCase());
		
		String x = "Bom dia, X"
				.replace("X","Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(x);
		
		/*
		 * Tipos primitivos não tem o operador "."
		 * 
		 * int a = 3;
		 * "a." não será válidado
		 * 
		 * */
	}
}
