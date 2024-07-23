package pizzaria;

import java.util.HashMap;

public class Pizza {
	
	private HashMap<String, Integer> ingredientes = new HashMap<>();

    public void adicionarIngrediente(String ingrediente, Integer quantidade)
    {
            ingredientes.put(ingrediente, quantidade);
    }

    
    public int getQtdIngredientes() {
    	Integer soma = 0;
    	for (Integer i : ingredientes.values()) {
    		soma += i;
    	}
    	return soma; 
    }
    
    public int getPreco()
    {
    	Integer precoTotal = 0;
    	Integer soma = 0;
    	for (Integer i : ingredientes.values()) {
    		soma += i;
    	}
    	Integer preco = 0;
    	if (soma <= 2) {
    		preco = 15;
    	} else if (soma <= 5) {
    		preco = 20;
    	} else {
    		preco = 23;
    	}
    	precoTotal += preco;
    	
    	return precoTotal;
    	
    }
    
    public HashMap<String, Integer> getIngredientes()
    {
    	return ingredientes;
    }
    
    public void zeraRegistroIngredientes(Pizza p) {
    	p.ingredientes.clear();
    }
}
	
	
