package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Ana"));
		
		System.out.println(lista.get(3)); // Consegue acessar pelo indice
		
		lista.remove(1);
		System.out.println( );
		lista.remove(new Usuario("Manu"));
		
		System.out.println("Tem ? " + lista.contains(new Usuario("Lia")));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
			System.out.println(usuario);
		}
		
	}
}
