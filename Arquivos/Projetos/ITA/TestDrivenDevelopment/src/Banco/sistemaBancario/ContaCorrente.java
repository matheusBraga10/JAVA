package Banco.sistemaBancario;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContaCorrente {
	
	Map <String, String> contas = new HashMap<>();
	private String numeroConta;
	private String usuarioConta;
	
	public Map<String, String> leitor() throws IOException{
		try {
			contas.put("senha1", "Matheus");
			contas.put("senha2", "Leo");
			contas.put("senha3", "Bia");
			contas.put("senha4", "Ana");
			
		
		} catch (Exception e) {
			System.out.println("Erro. Arquivo não encontrado.");
		}
		return contas;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}

	public String getUsuarioConta() {
		return usuarioConta;
	}


	
}
