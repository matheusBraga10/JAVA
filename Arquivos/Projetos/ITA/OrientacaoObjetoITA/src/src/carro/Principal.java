package carro;

public class Principal {

	public static void main(String[] args) {
		Corrida coridaDaAmizade = new Corrida(2000);
		coridaDaAmizade.adicionaCarro(new CarroSoma(10, 110, "Fusca"));
		coridaDaAmizade.adicionaCarro(new CarroSoma(8, 140, "Chevette"));
		coridaDaAmizade.adicionaCarro(new CarroMult(100, 1.7, "Kombi"));
		coridaDaAmizade.adicionaCarro(new CarroMult(110, 1.4, "Opala"));
		coridaDaAmizade.umDoisTresEJa();
	}

}
