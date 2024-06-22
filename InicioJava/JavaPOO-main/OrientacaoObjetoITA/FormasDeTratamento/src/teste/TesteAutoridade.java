package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import formasDeTratamento.Autoridade;
import formasDeTratamento.ComTitulo;
import formasDeTratamento.FormatadorNome;
import formasDeTratamento.Informal;
import formasDeTratamento.Respeitoso;

public class TesteAutoridade {

	FormatadorNome formatadorNome;
	Autoridade autoridade;
	
	@Test
	public void testeInformal() {
		formatadorNome = new Informal();
		autoridade = new Autoridade("Matheus", "Braga",  formatadorNome);
		assertEquals("Matheus", autoridade.getTratamento());
	}
	@Test
	public void testeRespeitosoMasculino() {
		formatadorNome = new Respeitoso(true);
		autoridade = new Autoridade("Matheus", "Braga", formatadorNome);
		assertEquals("Sr. Matheus Braga", autoridade.getTratamento());
	}
	@Test
	public void testeRespeitosoFeminino() {
		formatadorNome = new Respeitoso(false);
		autoridade = new Autoridade("Maria", "Bethânia", formatadorNome);
		assertEquals("Sra. Maria Bethânia", autoridade.getTratamento());
	}
	@Test
	public void testeComTitulo() {
		formatadorNome = new ComTitulo("Magnífico");
		autoridade = new Autoridade("Matheus", "Braga", formatadorNome);
		assertEquals("Magnífico Matheus Braga", autoridade.getTratamento());
	}

}
