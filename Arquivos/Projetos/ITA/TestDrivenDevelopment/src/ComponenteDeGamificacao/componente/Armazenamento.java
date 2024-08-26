package ComponenteDeGamificacao.componente;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Armazenamento {

	private Usuario usuario;
	private String tipoPonto;
	private Integer ponto;

	HashMap<String, Map<String, Integer>> armazenaDados = new HashMap<>();
	
	
	
	public HashMap<String, Map<String, Integer>> armazenaDado(Usuario usuario, String tipoPonto, Integer ponto){
		this.usuario = usuario;
		this.tipoPonto = tipoPonto;
		this.ponto = ponto;
		armazenaDados.put(usuario.getUsuario(), Map.of(getTipoPonto(), getPonto()));
		return armazenaDados;
	} 

	public HashMap<String, Map<String, Integer>> recuperaPontoPorTipo() {
		return getArmazenaDados();
	}
	
	public HashMap<Object, Object> retornaTodosComPonto(){
		HashMap<Object, Object> saida = new HashMap<>();
		retornaValores(saida);
		return saida;
	}

	private void retornaValores(HashMap<Object, Object> saida) {
		for(Entry<String, Map<String, Integer>> entrada : armazenaDados.entrySet()) {
			String key = entrada.getKey();
			Map<String, Integer> value = entrada.getValue();
			if(value.containsValue(0)) return;
			saida.put(key, value);
		}
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

	private HashMap<String, Map<String, Integer>> getArmazenaDados() {
		return armazenaDados;
	}


	



}
