package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {
	public static void main(String[] args) {
	
		Calc c1 = new Calc1(); 
		Calc c2 = new Calc2();
		
		System.out.println(c1.soma(1,2,3));
		System.out.println(c2.soma(1,2,3));
		
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
//		Calculadora calculadora = new CalculadoraImpl();
		
		System.out.println(calc.soma(2,3,4));
		
//		System.out.println(calculadora.getLoggerClasss() );
		
//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		System.out.println(op.soma(4,5,6));
		
		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];
			
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
 			fieldId.setAccessible(false);
			
 			System.out.println(calc.getId() );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		System.out.println(CalculadoraImpl.class.getDeclaredFields()[0].getName());
	}
}
