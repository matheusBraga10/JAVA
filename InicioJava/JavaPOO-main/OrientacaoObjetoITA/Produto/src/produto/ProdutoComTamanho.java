package produto;

import java.util.Objects;

public class ProdutoComTamanho extends Produto {
	
	private double tamanho;

	
	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tamanho);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		return Double.doubleToLongBits(tamanho) == Double.doubleToLongBits(other.tamanho);
	}
	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

}
