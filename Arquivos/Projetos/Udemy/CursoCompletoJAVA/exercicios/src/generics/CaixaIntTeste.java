package generics;

public class CaixaIntTeste {
	public static void main(String[] args) {
//		CaixaInt<String> caixaA = new CaixaInt<String>();
//		caixaA.setCoisa("Teste"); alteração de tipo ocorreu por herança na CaixaInt.java
		
		CaixaInt caixaA = new CaixaInt();
		caixaA.setCoisa(123);
		
		Integer	coisaA = caixaA.getCoisa();
		System.out.println(coisaA);
		
	}
}
