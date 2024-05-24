package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // Conversão implicita
		System.out.println("int para double: " + a);
		
		float b = (float) 1.1234567899999999; // Conversão explicita
		System.out.println("double para float: " + b);
		
		int c = (int) 1.123456789; // Conversão explicita é truncada por padrão
		System.out.println("double para int: " + c); 
		
		int d = 128;
		byte e = (byte) d;
		System.out.println("int para byte: " + e);
		
		double f = 1.99999999;
		int g = (int) f;
		System.out.println("double para int: " + g); 
	}
}
