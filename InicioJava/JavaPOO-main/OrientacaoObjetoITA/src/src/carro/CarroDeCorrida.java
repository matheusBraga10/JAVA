package carro;

public abstract class CarroDeCorrida {

	protected int velocidade;

	public abstract void acelerar();

	protected int velocidadeMaxima;
	protected String nome;



	public CarroDeCorrida(int velocidadeMaxima, String nome) {
		this.velocidadeMaxima = velocidadeMaxima;
		this.nome = nome;
		this.velocidade = 0;
	}

	public void frear() {
		velocidade = velocidade/2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome, CarroSoma carro) {
		this.nome = nome;
	}

	public void setVelocidade(int velocidade, CarroSoma carro) {
		this.velocidade = velocidade;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima, CarroSoma carro) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

}
