package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ","Js\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Python ","Lisp ","Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print); 
		Arrays.stream(maisLangs, 1, 3).forEach(print); // execução numerada (do 1o até o 3o rejeitando o 3o)
		
		List<String> outrasLangs = Arrays.asList("C ","PHP ","Kotlin\n");
		outrasLangs.stream().forEach(print); // execução em sequencia
		outrasLangs.parallelStream().forEach(print); // execução em paralelo
		
//		Stream.generate(() -> "a").forEach(print); Geração de Stream infinita sem ordenação
//		Stream.iterate(0, n -> n+1).forEach(println); Geração de Stream infinita ordenada
		
		
		
	}
}
