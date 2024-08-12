package ComponenteDeGamificacao.teste;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import ComponenteDeGamificacao.componente.Armazenamento;
import ComponenteDeGamificacao.componente.Usuario;

public class TesteArmazenamento {
	
	Usuario usuario;
	Armazenamento armazenamento;
	HashMap<Object, Object> expected;
	HashMap<Object, Object> interExpected;
	
	@Before
	public void carregaDados() {
		armazenamento = new Armazenamento();
		expected = new HashMap<>();
		interExpected = new HashMap<>();
		usuario = new Usuario("Matheus");
		
	}
	
	@Test
	public void testArmazenaDados() {
		interExpected.put("estrela", 10);
		expected.put(usuario, interExpected);
		assertEquals(expected
				, (armazenamento.armazenaDado(usuario, "estrela", 10)));
	}

	@Test
	public void testRecuperaDados() {
		interExpected.put("estrela", 10);
		expected.put(usuario, interExpected);
		armazenamento = new Armazenamento();
		armazenamento.armazenaDado(usuario, "estrela", 10);
		assertEquals(expected
				, (armazenamento.recuperaPontoPorTipo()));
	}

	@Test
	public void testNaoRetornaQuandoNaoTemPonto() {
		armazenamento = new Armazenamento();
		armazenamento.armazenaDado(usuario, "estrela", 0);
		assertEquals(null
				, (armazenamento.recuperaPontoPorTipo()));
	}
	
	@Test
	public void testRetornaQuandoTemPonto() {
		interExpected.put("estrela", 10);
		expected.put(usuario, interExpected);
		armazenamento = new Armazenamento();
		armazenamento.armazenaDado(usuario, "estrela", 10);
		assertEquals(expected
				, (armazenamento.recuperaPontoPorTipo()));
	}

	@Test
	public void testRetornaTodosQuandoTemPonto() {
		Usuario usuario1;
		Usuario usuario2;
		Usuario usuario3;
		usuario1 = new Usuario("Matheus");
		usuario2 = new Usuario("Lucas");
		usuario3 = new Usuario("Max");
		interExpected.put("estrela", 10);
		interExpected.put("estrela", 0);
		interExpected.put("moeda", 50);
		expected.put(usuario1, interExpected);
		expected.put(usuario2, interExpected);
		expected.put(usuario3, interExpected);
		
		armazenamento = new Armazenamento();
		armazenamento.armazenaDado(usuario1, "estrela", 10);
		armazenamento.armazenaDado(usuario2, "estrela", 0);
		armazenamento.armazenaDado(usuario3, "moeda", 50);
		
		assertEquals(expected
				, (armazenamento.retornaTodosComPonto()));
	}
	


}
