package banco;

public class ContaCorrente {
	
	private int saldo;
	
	public int sacar(int valor) {
		if(valor > saldo) {
			return 0;
		} else {
			saldo -= valor;
		} return valor;
	}
	
	public void depositar(int valor) {
		saldo += valor;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
}
