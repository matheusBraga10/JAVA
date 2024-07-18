package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuebraString {
	
	
	private static String string;
	static List<Object> c  = new ArrayList<>();
	
	public QuebraString(String string) {
		QuebraString.string = string;
	}

	public String printConstrutor() {
		return string;
	}


	public static String separarPalavras() {
		if(string.length() < 3 || string != null) {
			for(char ch : string.toCharArray()) {
				if(Character.isUpperCase(ch)) {
					c.add(' ');
				}
				c.add(ch++);
			}
			String novaString = c.stream().map(Object::toString)
					.collect(Collectors.joining(""));
			return novaString;
		} else {
			return string;
		}
	}
	
	public static List<String> converterCamelCase(String original){
		List<String> input = new ArrayList<>();
		original = QuebraString.separarPalavras()
				.toLowerCase();
		String[] novaLista = original.split(" ");
		for(String nova : novaLista) {	
			input.add(nova);
		}
		return input;
	}
	
	

	
}
	


