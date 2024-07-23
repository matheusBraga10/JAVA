package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println("Convertendo inteiro para String: " + num1.toString());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		
		System.out.println(("" + num2).length()); // Opção não padrão
		
		
	}
}
