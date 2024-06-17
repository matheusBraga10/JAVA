package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		Calculo calculo = (x, y) -> {return x + y;}; // Função Lambda
		System.out.println(calculo.executar(2, 3));
		
		calculo = (x, y) ->  x * y; // Função Lambda (FOI OMITIDA AS CHAVES, FINCANDO IMPLICITO SOMENTE O RETURN DA FUNÇÃO)
		System.out.println(calculo.executar(2, 3));

		calculo = (x, y) -> {return x / y;}; // Função Lambda
		System.out.println(calculo.executar(2, 3));
		
		System.out.println(calculo.legal());
		System.out.println(calculo);
		
		
	}
}
