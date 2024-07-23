package lambdas;

public class Produto extends Object { // Toda classe JAVA herda de Objects por padrão
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		double precoFinal = preco*(1-desconto);
		return "Produto [nome=" + nome + ", preco= R$ " + precoFinal + "]";
	}
	
	
}
