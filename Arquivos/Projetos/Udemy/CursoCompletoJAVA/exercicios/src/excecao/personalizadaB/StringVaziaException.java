package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	String nomeAtributo;

	public StringVaziaException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeAtributo);
	}
	
	
}
