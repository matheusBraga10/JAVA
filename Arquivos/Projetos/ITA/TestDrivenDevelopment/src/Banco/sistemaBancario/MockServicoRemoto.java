package Banco.sistemaBancario;

import static org.junit.Assert.assertEquals;


public class MockServicoRemoto implements ServicoRemoto {

	private String numeroRecebido;
	
	@Override
	public void recuperarConta(String numero) {
		numeroRecebido = numero;
	}

	@Override
	public void persistirConta(String numeroEsperado) {
		assertEquals(numeroEsperado, numeroRecebido);
	}

}
