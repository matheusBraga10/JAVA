package comercio;

public class Compra {
	int valorTotal;
	int numeroDeParcelas;
	
	// a vista
	public Compra(int valor) {
		valorTotal = valor;
		numeroDeParcelas = 1;
	}

	// parcelado
	public Compra(int valorParcelas, int qtdParcelas) {
		valorTotal = valorParcelas*qtdParcelas;
		numeroDeParcelas = qtdParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}
	
	public int getValorParcela() {
		return valorTotal/numeroDeParcelas;
	}
	
	
	
}
