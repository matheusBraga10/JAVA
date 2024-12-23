package HandsOn.teste;

import static org.junit.Assert.assertEquals;

public class MockObservadorCarrinho implements ObservadorCarrinho {

	private String nomeRecebido;
	private int valorRecebido;
	private boolean darPau = false;
	
	@Override
	public void produtoAdicionado(String nome, int valor) {
		if(darPau) throw new RuntimeException("Problema simulado pelo Mock");
		nomeRecebido = nome;
		valorRecebido = valor;
	}

	public void verificaRecebimentoProduto(String nomeEsperado, int valorEsperado) {
		assertEquals(nomeEsperado, nomeRecebido);
		assertEquals(valorEsperado, valorRecebido);
	}

	public void queroQueVoceDePau() {
		darPau = true;
		
	}

}
