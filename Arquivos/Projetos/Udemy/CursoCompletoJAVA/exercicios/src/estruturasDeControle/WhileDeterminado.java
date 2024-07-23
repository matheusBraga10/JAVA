package estruturasDeControle;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		int contador = 0;
		
		while (contador <= 10) {
			System.out.println("contador = " + contador);
			contador++;
		}
		while (contador < 50) {
			System.out.println(contador);
			contador+=5;
		}
	}
}
