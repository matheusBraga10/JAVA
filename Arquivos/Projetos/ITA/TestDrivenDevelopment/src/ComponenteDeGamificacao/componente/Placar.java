package ComponenteDeGamificacao.componente;

public class Placar {

	Armazenamento armazenamento;

	private Usuario usuario;
	private String tipoPonto;
	private Integer ponto;
	
	Usuario nomeArmazenado = ((Placar) armazenamento.armazenaDados.keySet()).getUsuario();
	
	public String registraPontosUsuario(Armazenamento armazenamento) {
		this.armazenamento = armazenamento;
		armazenamento.armazenaDado(usuario, tipoPonto, ponto);
		return "O usuário " + usuario +  " recebeu " + ponto + " pontos do tipo " + tipoPonto;
	}

	public String retornaPontosUsuario() {
		return "O usuário " + usuario + " tem " + ponto + " pontos do tipo " + tipoPonto;
	}
	

	private Usuario getUsuario() {
		return usuario;
	}
	protected void setUsuario(String usuario) {
		getUsuario();
	}
	private String getTipoPonto() {
		return tipoPonto;
	}
	protected void setTipoPonto(String tipoPonto) {
		getTipoPonto();
	}
	private Integer getPonto() {
		return ponto;
	}
	protected void setPonto(Integer ponto) {
		getPonto();
	}

}
