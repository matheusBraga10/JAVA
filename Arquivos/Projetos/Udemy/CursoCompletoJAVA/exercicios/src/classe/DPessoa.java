package classe;

public class DPessoa {
	String nome;
	double peso;
	
	DPessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(DComida comida){
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	String apresenta() {
	return String.format("Olá, sou o %s e tenho Kg %.3f", this.nome,this.peso);
	}
	
}
