package streams;

import java.util.function.UnaryOperator;

//	public interface Utilitarios { (necessário tirar final dos metodos)

public class Utilitarios {
	private Utilitarios(){ 
//		Consttrutor privado faz com que não possa ser instanciado
	}
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	
	public final static String grito (String n){
		return n + "!!!  "; 
	}
}
