package Banco.sistemaBancario;

public interface ServicoRemoto {
	
	public void recuperarConta(String numero);
	
	void persistirConta(String numeroEsperado);
}
