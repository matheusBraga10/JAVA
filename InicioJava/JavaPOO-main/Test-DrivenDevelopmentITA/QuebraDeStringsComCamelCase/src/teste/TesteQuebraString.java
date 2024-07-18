package teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteQuebraString {

	private QuebraString quebraString;
	
	
	/*
	 * PRIMEIRO TESTE: 
	 * Teste adicionado: testStringConstrutor()
	 * Estado do código anterior: Nulo
	 * Estado do código posterior ao teste: Foi criada a classe QuebraString com seu construtor e metodo printConstrutor, porém todos nulos;
	 * Foi feito somente uma correção dos pontos que estavam alertando erro no código do teste.
	 * O teste não rodou (o que já era previsto).
	 * Como o teste não rodou, vamos para etapa de refatoração do código
	 * 
	 * SEGUNDO TESTE:
	 * Teste adicionado: testSeparaString()
	 * Estado do código: Foi refatorado para rodar a string de retorno do construtor corretamente, e criado o metodo converterCamelCase() que até o momento retorna nulo;
	 * O teste não rodou (previsto);
	 * Segue a parte de refatoração do código para rodar;
	 * */
	
	
	
	@Test
	public void testLeStringConstrutor() {
		quebraString = new QuebraString("nomeComposto");
		assertEquals("nomeComposto", quebraString.printConstrutor());
	}

	@Test
	public void testSeparaString() {
		quebraString = new QuebraString("");
		assertEquals("nome Composto", QuebraString.separarPalavras());
	}
	
	@Test
	public void testConverterCamelCase() {
		quebraString = new QuebraString("nomeComposto");
		assertEquals(new ArrayList<String>(Arrays.asList("nome, composto")), QuebraString.converterCamelCase("nomeComposto"));
		
	}
	

}
