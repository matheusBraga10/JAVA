package oo.heranca.desafio;

public interface Luxo {
	void ligarAr(); // Métodos obrigatórios à classe que extende Luxo
	void desligarAr();
	
	default int nivelAr() { // Método opcional
		return 1;
	}
}
