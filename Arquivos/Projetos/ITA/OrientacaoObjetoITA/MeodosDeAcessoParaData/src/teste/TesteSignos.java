package teste;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import metodosDeAcessoParaData.Pessoa;

public class TesteSignos {
	
	
	@Test
	public void testIdade() {
		Pessoa pessoa;
		pessoa = new Pessoa(LocalDate.of(1999, 1, 15));
		assertEquals(25, pessoa.getIdade());
	}

}
