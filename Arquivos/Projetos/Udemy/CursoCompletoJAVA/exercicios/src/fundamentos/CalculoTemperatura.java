package fundamentos;

public class CalculoTemperatura {
	public static void main(String[] args) {
		double farenheit;
		final int SUBTRACAO = 32;
		final double FATOR = 5/9.0;
		
		farenheit = 86;
		double calculoF = ((farenheit - SUBTRACAO) *FATOR);
		System.out.println(farenheit +  "°F equivale a " + calculoF + "°C");
		
		farenheit = 100;
		calculoF = ((farenheit - SUBTRACAO) *FATOR);
		System.out.println(farenheit +  "°F equivale a " + calculoF + "°C");

		farenheit = 32;
		calculoF = ((farenheit - SUBTRACAO) *FATOR);
		System.out.println(farenheit +  "°F equivale a " + calculoF + "°C");
		
	}
}
