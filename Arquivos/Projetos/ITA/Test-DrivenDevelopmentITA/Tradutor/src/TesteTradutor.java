import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TesteTradutor {
	
	private Tradutor tradutor;
	
	@Before
	public void criarTradutor() {
		tradutor = new Tradutor();
		
	}
	
	@Test
	public void tradutorSemPalavras() {
		assertTrue(tradutor.estaVazio());
	}
	
	@Test
	public void umaTraducao() {
		tradutor.addTraducao("bom", "good");
		assertFalse(tradutor.estaVazio());
		assertEquals("good", tradutor.traduzir("bom"));
	}

	@Test
	public void duasTraducoes() {
		tradutor.addTraducao("bom", "good");
		tradutor.addTraducao("mau", "bad");
		assertFalse(tradutor.estaVazio());
		assertEquals("good", tradutor.traduzir("bom"));
		assertEquals("bad", tradutor.traduzir("mau"));
	}

	@Test
	public void duasTraducoesMesmaPalavra() {
		tradutor.addTraducao("bom", "good");
		tradutor.addTraducao("bom", "nice");
		assertEquals("good, nice", tradutor.traduzir("bom"));
	}

	@Test
	public void traduzirFrase() {
		tradutor.addTraducao("guerra", "war");
		tradutor.addTraducao("é", "is");
		tradutor.addTraducao("ruim", "bad");
		assertEquals("war is bad", tradutor.traduzirFrase("guerra é ruim"));
	}

	@Test
	public void traduzirFraseCom2TraducoesMesmaPalavra() {
		tradutor.addTraducao("paz", "peace");
		tradutor.addTraducao("é", "is");
		tradutor.addTraducao("bom", "good");
		tradutor.addTraducao("bom", "nice");
		assertEquals("peace is good", tradutor.traduzirFrase("paz é bom"));
	}
	
	
}
