package fundamentos;

public class DesafioOperadoresAritmeticos {
	public static void main(String[] args) {
		int a = 6*(3+2);
		int b = 3*2;
		int c = (1-5)*(2-7);
		int d = 2;
		int e = 10;
		
		double calculo = (Math.pow((Math.pow(a,2)/b)-(Math.pow(c/d, 2)),3)/(Math.pow(e, 3)));
		System.out.println(calculo); 
	}
}
 