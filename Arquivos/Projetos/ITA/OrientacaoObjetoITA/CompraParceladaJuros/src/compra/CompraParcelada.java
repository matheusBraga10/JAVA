package compra;

public class CompraParcelada extends Compra {

	private int quantidadeParcelas;
	private double jurosMensal;
	
	public CompraParcelada(double valor, int quantidadeParcelas, double jurosMensal) {
		super(valor);
		this.quantidadeParcelas = quantidadeParcelas;
		this.jurosMensal = jurosMensal;
		
	}
	
	public double total() {
		double valorTotal = 0;
		if((this.getQuantidade() == 1) || (this.getQuantidade() == 2) || (this.getQuantidade() == 5) || (this.getQuantidade() == 10)) {
			valorTotal = this.getValor() * Math.pow(1 + this.getJurosMensal(), this.getQuantidade());
		} else {
			System.out.println("Quantidade de parcelas inválida");
		}
		return valorTotal;
	}

	public int getQuantidade() {
		return quantidadeParcelas;
	}

	public void setQuantidade(int quantidade) {
		this.quantidadeParcelas = quantidade;
	}

	public double getJurosMensal() {
		return jurosMensal;
	}

	public void setJurosMensal(double jurosMensal) {
		this.jurosMensal = jurosMensal;
	}

	
}
