package testePizza;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pizzaria.CarrinhoDeCompras;
import pizzaria.Pizza;

public class testeCarrinho {

	@Test
	public void somaPrecoPizzas() {
		Pizza p = new Pizza();
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		p.adicionarIngrediente("tomate", 1);
		p1.adicionarIngrediente("queijo", 4);
		p2.adicionarIngrediente("carne", 10);
		c.adicionaPizza(p);
		c.adicionaPizza(p1);
		c.adicionaPizza(p2);
		assertEquals(Double.valueOf(58.0), c.getTotalPreco());
	}
	
	@Test
	public void adicaoNula() {
		Pizza p = new Pizza();
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		p.adicionarIngrediente("nulo", 0);
		c.adicionaPizza(p);
		assertTrue(c.getIngredientes().isEmpty());
	}
}
