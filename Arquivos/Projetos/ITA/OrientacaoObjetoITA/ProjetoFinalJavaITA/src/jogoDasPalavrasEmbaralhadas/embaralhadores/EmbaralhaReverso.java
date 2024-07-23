package jogoDasPalavrasEmbaralhadas.embaralhadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmbaralhaReverso implements Embaralhador{

	@Override
	public String embaralhar(String palavra) {
		List<Character> characters = new ArrayList<Character>();
		for (char c : palavra.toCharArray()) {
			characters.add(c);
		}
		Collections.reverse(characters);
		StringBuilder stringBuilder = new StringBuilder(characters.size());
		for(Character c : characters) {
			stringBuilder.append(c);
		}
		return stringBuilder.toString();
	}
}
