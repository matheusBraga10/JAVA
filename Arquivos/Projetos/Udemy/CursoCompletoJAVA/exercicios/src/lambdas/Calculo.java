package lambdas;

@FunctionalInterface // SÓ PODE USAR 1 METODO POR INTERFACE
public interface Calculo {

	double executar(double a, double b);

	default String legal() {
		return "legal";
		
	}
	
 	static String massa() {
		return "massa";
	}
}

