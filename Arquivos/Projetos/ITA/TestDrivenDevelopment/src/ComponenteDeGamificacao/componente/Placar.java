package ComponenteDeGamificacao.componente;

public class Placar {

	
	
	static Armazenamento armazenamento = new Armazenamento();
	
	public static Object regitraPontosUsuario(String usuario, Integer ponto, String tipoPonto) {
		armazenamento.armazenaDados(usuario);
		return "O usuário " + usuario + " recebeu " + ponto + " pontos do tipo " + tipoPonto;
	}

	public String retornaPontosUsuario() {
		
		
		return "O usuário " + armazenamento. +" tem " + armazenamento.recebePonto(ponto, null) + " pontos do tipo " + armazenamento.recebePonto(null, tipoPonto);
	}
	

	

}
