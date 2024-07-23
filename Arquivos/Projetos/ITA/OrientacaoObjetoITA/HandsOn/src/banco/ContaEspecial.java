package banco;

public class ContaEspecial extends ContaCorrente{
	
	int limite;

	public ContaEspecial(int limite) {
		this.limite = limite;
	}
	
	public int sacar(int valor) {
		if(valor > (getSaldo() + limite)) {
			return 0;
		} else {
			setSaldo(getSaldo() - valor);
		} return valor;
	}
	
	
}
