package jogoDasPalavrasEmbaralhadas.embaralhadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmbaralhaAleatorio implements Embaralhador{


	@Override
	public String embaralhar(String palavra) {
		List<Character> characters = new ArrayList<Character>();
		for (char c : palavra.toCharArray()) {
			characters.add(c);
		}
		Collections.shuffle(characters);
		StringBuilder stringBuilder = new StringBuilder(characters.size());
		for(Character c : characters) {
			stringBuilder.append(c);
		}
		return stringBuilder.toString();
	}
}
