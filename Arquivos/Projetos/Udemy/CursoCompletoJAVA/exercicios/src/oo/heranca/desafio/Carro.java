package oo.heranca.desafio;

public abstract class Carro {
	private final int VELOCIDADE_MAXIMA;
	private int velocidade = 50;
	private int delta = 5;
	
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	protected Carro(int VelocidadeMaxima) {
		super();
		VELOCIDADE_MAXIMA = VelocidadeMaxima;
	}

	public int acelerar(Carro carro) {
		if(velocidade <= VELOCIDADE_MAXIMA) {
			carro.velocidade+=getDelta();
		} else {
			velocidade = VELOCIDADE_MAXIMA;
		} 
		return velocidade;
	}
	
	public int frear(Carro carro) {
		if (velocidade >= 0 ) {
			carro.velocidade-= delta;
			return velocidade;
		} else {
			velocidade = 0;
			return velocidade;
		}
	}

	@Override
	public String toString() {
		return "Carro [velocidade=" + velocidade + "km/h]";
	}
	
	
}
