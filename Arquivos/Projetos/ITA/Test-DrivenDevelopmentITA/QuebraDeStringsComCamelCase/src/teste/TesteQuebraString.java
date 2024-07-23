package teste;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import camelCase.CamelCase;

public class TesteQuebraString {

	private CamelCase camelCase;
	
		
	@Test
	public void nome() {
		camelCase = new CamelCase("nome");
		ArrayList<String> retorno = new ArrayList<String>();
		retorno.add("nome");
		assertEquals(Arrays.asList(retorno), Arrays.asList(CamelCase.converterCamelCase()));
	}
	
	@Test
	public void nomeMaiusculo() {
		camelCase = new CamelCase("Nome");
		ArrayList<String> retorno = new ArrayList<String>();
		retorno.add("nome");
		assertEquals(Arrays.asList(retorno), Arrays.asList(CamelCase.converterCamelCase()));
	}
	
	@Test
	public void nomeComposto() {
		camelCase = new CamelCase("nomeComposto");
		ArrayList<String> retorno = new ArrayList<String>();
		retorno.add("nome");
		retorno.add("composto");
		 assertEquals(Arrays.asList(retorno), Arrays.asList(CamelCase.converterCamelCase()));
	}
	
	@Test
	public void CPF() {
		camelCase = new CamelCase("CPF");
		ArrayList<String> retorno = new ArrayList<String>();
		retorno.add("CPF");
		assertEquals(Arrays.asList(retorno), Arrays.asList(CamelCase.converterCamelCase()));
	}
	
	
	

}
	