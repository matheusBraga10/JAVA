package Banco.sistemaBancario;

import java.io.IOException;

public class CaixaEletronico {
	
	private int valorTotal;

	public String logar(String key, String value) throws IOException {
		ContaCorrente conta = new ContaCorrente();
		String login = (conta.leitor().containsKey(key) && conta.leitor().containsValue(value)) 
				? ("Usuário Autenticado") : ("Não foi possível autenticar o usuário");
		return login;
	}

	public String depositar(int valor) {
		this.valorTotal = valor;
		return ("Depósito recebido com sucesso");
	}

	public String saldo() {
		return ("O saldo é R$: " + getValorTotal() + ",00");
	}

	public Object sacar(int saque) {
		this.valorTotal -= saque;
		String result = valorTotal >= 0 ? ("Retire seu dinheiro") : ("Saldo insuficiente");
		return result;
	}
	
	
	public int getValorTotal() {
		return valorTotal;
	}

	public void recuperaConta(ServicoRemoto mock) {
		// TODO Auto-generated method stub
		
	}

	public void persistirConta(ServicoRemoto mock) {
		// TODO Auto-generated method stub
		
	}

	

	
}
