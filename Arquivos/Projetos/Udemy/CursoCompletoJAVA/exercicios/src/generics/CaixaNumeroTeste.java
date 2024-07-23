package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
//		CaixaNumero<String> caixaA = new CaixaNumero<>(); Não pode pois CaixaNumero herda de Number 
		
		CaixaNumero<Number> caixaA = new CaixaNumero<Number>();
		caixaA.setCoisa(2.3);
		System.out.println(caixaA.getCoisa());

		CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
		caixaA.setCoisa(2);
		System.out.println(caixaA.getCoisa());

		CaixaNumero<Double> caixaC = new CaixaNumero<>();
		caixaA.setCoisa(2.1234);
		System.out.println(caixaA.getCoisa());
		
	}
}
