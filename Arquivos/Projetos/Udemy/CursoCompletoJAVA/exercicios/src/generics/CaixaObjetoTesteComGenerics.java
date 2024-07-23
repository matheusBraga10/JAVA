package generics;

public class CaixaObjetoTesteComGenerics {
	public static void main(String[] args) {
		
		CaixaObjetoComGenerics<Double> caixaA = new CaixaObjetoComGenerics<>();
		caixaA.setCoisa(2.3); // double -> Double
		
//		Integer coisa = (Integer) caixaA.getCoisa();
//		System.out.println(coisa); Erro gerado por tipos primitivos diferentes

		double coisaA =  caixaA.getCoisa();
		System.out.println(coisaA);
		
		CaixaObjetoComGenerics<String> caixaB = new CaixaObjetoComGenerics<String>();
		caixaB.setCoisa("Olá"); 
		
		String coisaB = caixaB.getCoisa();
		System.out.println(coisaB);
//		O Generics torna essas declarações e interpretações mais simples para serem definidas em outro momento
	
	}
}
