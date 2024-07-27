package camelCase;

import java.util.ArrayList;

public class CamelCase {

	private static String original;
	
	public CamelCase(String original) {
		this.original = original;
	}

	public static ArrayList<String> converterCamelCase() {
		String modificado = "";
		ArrayList<String> listaPalavras = new ArrayList<String>();
		
		String[] palavras = listandoPalavras(modificado);
		for(String palavra : palavras) {
				listaPalavras.add(palavra);
			}
		return listaPalavras;
	}

	private static String[] listandoPalavras(String modificado) {
		if(original.length() > 3 ) {
			String[] palavras = preparaListandoPalavras(modificado);
			return palavras;
		} else {
			String[] siglaStringLista = preparaListandoSiglas();
			return siglaStringLista;
		}
	}

	private static String[] preparaListandoSiglas() {
		char[] sigla = original.toCharArray();
		String siglaString = String.copyValueOf(sigla);
		String[] siglaStringLista = siglaString.split(" ");
		return siglaStringLista;
	}

	private static String[] preparaListandoPalavras(String modificado) {
		for(char letra : original.toCharArray()) {
			if(Character.isUpperCase(letra)) {
				modificado += " ";
			}
		modificado += Character.toLowerCase(letra);
		}
		String[] palavras = modificado.strip().split(" ");
		return palavras;
	}
	
}
