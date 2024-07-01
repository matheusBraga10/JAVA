package teste;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import jogoDasPalavrasEmbaralhadas.dados.BancoDePalavras;

public class TesteBanco {

	
	
	@Test
    public void testGetTamanho() {
		BancoDePalavras mPalavras = new BancoDePalavras();
        mPalavras.palavraAleatoria();
        assertEquals(26, mPalavras.getTamanho());
    }

}
