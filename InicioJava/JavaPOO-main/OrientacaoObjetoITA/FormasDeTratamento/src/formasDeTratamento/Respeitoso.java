package formasDeTratamento;

public class Respeitoso implements FormatadorNome {

	private boolean masculino;
	
	

	public Respeitoso(boolean masculino) {
		this.masculino = masculino;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return (isMasculino() == true) ? ("Sr. " + nome + " " + sobrenome) : ("Sra. " + nome + " " + sobrenome);
	}

	public boolean isMasculino() {
		return masculino;
	}

	
}
