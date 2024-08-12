package ComponenteDeGamificacao.componente;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Armazenamento {

	private Usuario usuario;
	private String tipoPonto;
	private Integer ponto;

	HashMap<String,Integer> dados = new HashMap<>();
	HashMap<Object,Object> armazenaDados = new HashMap<>();
	
	
	
	public HashMap<Object, Object> armazenaDado(Usuario usuario, String tipoPonto, Integer ponto){
		this.usuario = usuario;
		this.tipoPonto = tipoPonto;
		this.ponto = ponto;
		dados.put(getTipoPonto(), getPonto());
		armazenaDados.put(getUsuario(), getDados());
		return armazenaDados;
	} 

	public HashMap<Object, Object> recuperaPontoPorTipo() {
		if(((HashMap<String, Integer>) armazenaDados.get(getUsuario())).get(getTipoPonto()) <= 0) return null;
		return getArmazenaDados();
	}
	
	public HashMap<Object, Object> retornaTodosComPonto(){
		HashMap<Object, Object> saida = new HashMap<>();
		for(Entry<Object, Object> entrada : armazenaDados.entrySet()) {
			if(((HashMap<String, Integer>) armazenaDados.get(getUsuario())).get(getTipoPonto()) <= 0) return null;
			saida.put(entrada.getKey(), entrada.getValue());
		}
		return saida;
	}
	
	private Usuario getUsuario() {
		return usuario;
	}

	private String getTipoPonto() {
		return tipoPonto;
	}

	private Integer getPonto() {
		return ponto;
	}

	private HashMap<String, Integer> getDados() {
		return dados;
	}

	private HashMap<Object, Object> getArmazenaDados() {
		return armazenaDados;
	}


	



}
