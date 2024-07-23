package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios  = new HashMap<>();
		
		usuarios.put(1,  "Roberto"); // Add dado
		usuarios.put(1,"Ricardo"); // Modificar dado 1
		usuarios.put(2,"Rafaela"); 
		usuarios.put(20,"Rebeca"); 
		usuarios.put(4,"Roberto"); 

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());

		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));

		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(1, "GUI"));
		
		System.out.println();
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println();
		for (String valor  : usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println();
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
		
		
		
		
		
	}
}
