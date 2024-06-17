package pizzaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Pizza> pizzas = new ArrayList<Pizza>();

    public void adicionaPizza(Pizza pizza) {
            if (pizza.getQtdIngredientes() > 0) {
                pizzas.add(pizza);
            } else {
            	pizzas.remove(pizza);
            }

    }

    public Double getTotalPreco() {
            Double total = 0.0;
            for (Pizza pizza : pizzas) {
                total += pizza.getPreco();   
            }
            return total;
    }

    public HashMap<String, Integer> getIngredientes() {
            HashMap<String, Integer> carrinho = new HashMap<String, Integer>();
            for (Pizza item : pizzas) {
                HashMap<String, Integer> ingredientes = item.getIngredientes();
                for (String key : ingredientes.keySet()) {
                    Integer total = ingredientes.get(key);
                    if (carrinho.containsKey(key)) {
                        total += carrinho.get(key);
                    }
                    carrinho.put(key, total);
                }
            }

            return carrinho;
    }	
}


