package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jogoDasPalavrasEmbaralhadas.embaralhadores.EmbaralhaAleatorio;
import jogoDasPalavrasEmbaralhadas.embaralhadores.EmbaralhaReverso;

public class TesteEmbaralha {

	 @Test
	    public void tesInversor() {
	        EmbaralhaReverso palavras = new EmbaralhaReverso();
	        String resultado = palavras.embaralhar("Jose");
	        assertEquals("esoJ", resultado);
	    }
	    
	    @Test
	    public void tesTrocaParImpar() {
	        EmbaralhaAleatorio palavras = new EmbaralhaAleatorio();
	        String resultado = palavras.embaralhar("Jose");
	        assertEquals("soeJ", resultado);
	    }
}
