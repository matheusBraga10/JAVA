package ComponenteDeGamificacao.componente;

import java.util.HashMap;

public class Armazenamento {

	private String usuario;
	private String tipoPonto;
	private String ponto;

	HashMap<String,Object> dados = new HashMap<>();
	
	public HashMap<String,Object> armazenaDados(String usuario){
		dados.put(getTipoPonto(), getPonto());
		HashMap<String,Object> armazenaDados = new HashMap<>();
		armazenaDados.put(usuario, dados);
		return armazenaDados;
	}
	
	
	
	
	
	
	
	
	private String getUsuario() {
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
	private String getPonto() {
		return ponto;
	}
	protected void setPonto(Integer ponto) {
		getPonto();
	}	
	

	
}
