package ComponenteDeGamificacao.componente;

import java.util.HashMap;

public class Placar {

	Armazenamento armazenamento;

	private Usuario usuario;
	private String tipoPonto;
	private Integer ponto;
	
	Usuario nomeArmazenado = ((Placar) armazenamento.armazenaDados.keySet()).getUsuario();
	String pontoArmazenado = (String) ((HashMap<Object, Object>) armazenamento.armazenaDados.get(getUsuario())).get(getTipoPonto());
	String tipoPontoArmazenado = (String) (armazenamento.armazenaDados.get(getTipoPonto()));
	
	public Object registraPontosUsuario() {
		armazenamento = new Armazenamento();
		armazenamento.armazenaDado(usuario, tipoPonto, ponto);
		return "O usuário " + nomeArmazenado +  " recebeu " + pontoArmazenado + " pontos do tipo " + tipoPontoArmazenado;
	}

	public String retornaPontosUsuario() {
		return "O usuário " + nomeArmazenado +" tem " + pontoArmazenado + " pontos do tipo " + tipoPontoArmazenado;
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
