package Banco.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Test;

import Banco.sistemaBancario.CaixaEletronico;
import Banco.sistemaBancario.MockServicoRemoto;

public class TesteCaixaEletronico {

	CaixaEletronico caixaEletronico;
	
	@Test
	public void testLogar() throws IOException {
		caixaEletronico = new CaixaEletronico();
		MockServicoRemoto mock = new MockServicoRemoto();
		caixaEletronico.recuperaConta(mock);
		assertEquals("Usuário Autenticado", caixaEletronico.logar("senha1", "Matheus"));
	}

	@Test
	public void testLogarErro() throws IOException {
		caixaEletronico = new CaixaEletronico();
		MockServicoRemoto mock = new MockServicoRemoto();
		caixaEletronico.recuperaConta(mock);
		assertEquals("Não foi possível autenticar o usuário", caixaEletronico.logar("senha5", "Matheus"));
	}
	
	@Test
	public void testDepositar() throws IOException {
		caixaEletronico = new CaixaEletronico();
		caixaEletronico.logar("senha2", "Leo");
		MockServicoRemoto mock = new MockServicoRemoto();
		caixaEletronico.recuperaConta(mock);
		caixaEletronico.persistirConta(mock);
		assertEquals("Depósito recebido com sucesso" , caixaEletronico.depositar(500));
	}
	
	@Test
	public void testSaldo() throws IOException {
		caixaEletronico = new CaixaEletronico();
		caixaEletronico.logar("senha3", "Bia");
		MockServicoRemoto mock = new MockServicoRemoto();
		caixaEletronico.recuperaConta(mock);
		caixaEletronico.persistirConta(mock);
		caixaEletronico.depositar(50);
		assertEquals("O saldo é R$: 50,00" , caixaEletronico.saldo());
	}

	@Test
	public void testSacar() throws IOException {
		caixaEletronico = new CaixaEletronico();
		caixaEletronico.logar("senha4", "Ana");
		MockServicoRemoto mock = new MockServicoRemoto();
		caixaEletronico.recuperaConta(mock);
		caixaEletronico.persistirConta(mock);
		caixaEletronico.depositar(100);
		assertEquals("Retire seu dinheiro", caixaEletronico.sacar(10));
	}

	@Test
	public void testSacarErro() throws IOException {
		caixaEletronico = new CaixaEletronico();
		caixaEletronico.logar("senha4", "Ana");
		MockServicoRemoto mock = new MockServicoRemoto();
		caixaEletronico.recuperaConta(mock);
		caixaEletronico.persistirConta(mock);
		caixaEletronico.depositar(100);
		assertEquals("Saldo insuficiente", caixaEletronico.sacar(1000));
	}

}
