package jogoDasPalavrasEmbaralhadas.embaralhadores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhadores {

	private static List<Embaralhador> embaralhadores = new ArrayList<Embaralhador>();
	
	static {
		embaralhadores.add((Embaralhador) new EmbaralhaReverso());
		embaralhadores.add((Embaralhador) new EmbaralhaAleatorio());
	}
	
	    public static Embaralhador getRandom(){
	        Random random = new Random(System.currentTimeMillis());
	        int referencia = random.nextInt();
	        int indice = referencia % embaralhadores.size();
	        
	        return  embaralhadores.get(Math.abs(indice));
	    }

	
	
	
}
