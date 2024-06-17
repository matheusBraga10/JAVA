package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS","PHP","JAVA","C++");
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
		
		String ultimaLiguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLiguagem1);
		
		Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(numeros);
		System.out.println(ultimoNumero1);
		
		String ultimaLiguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLiguagem2);

		Integer ultimoNumero2 = ListaUtil.getUltimo2(numeros);
		System.out.println(ultimoNumero2);
		
		
	}
}
