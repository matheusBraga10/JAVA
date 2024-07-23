package experienciaAcesso.pacote;

public class Referencia {
	int modificadorDefaut;
	public int modificadorPublico;
	protected int modificadorProtegido;
	private int modificadorPrivado;
	
	public Referencia() {
		
	}

	public void testeAcesso() {
		modificadorDefaut = 0;
		modificadorPublico = 0;
		modificadorProtegido = 0;
		modificadorPrivado = 0;
		
	}


	
	
}
