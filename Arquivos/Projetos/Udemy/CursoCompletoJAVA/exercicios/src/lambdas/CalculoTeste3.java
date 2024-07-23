package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		
//		NÃO: int -> Double;
//		double -> Double
		
		BinaryOperator<Double> calculo = (x, y) -> {return x + y;}; // Função Lambda
		System.out.println(calculo.apply(2.0, 3.0));
		
		calculo = (x, y) ->  x * y; // Função Lambda (FOI OMITIDA AS CHAVES, FINCANDO IMPLICITO SOMENTE O RETURN DA FUNÇÃO)
		System.out.println(calculo.apply(2.0, 3.0));

		calculo = (x, y) -> {return x / y;}; // Função Lambda
		System.out.println(calculo.apply(2.0, 3.0));
		
		
		BinaryOperator<Integer> calc = (x, y) -> {return x + y;}; // Função Lambda
		System.out.println(calc.apply(2, 3));
		
		calc  = (x, y) ->  x * y; // Função Lambda (FOI OMITIDA AS CHAVES, FINCANDO IMPLICITO SOMENTE O RETURN DA FUNÇÃO)
		System.out.println(calc.apply(2, 3));
	}
}
