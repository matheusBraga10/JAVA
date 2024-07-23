package testePizza;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pizzaria.Pizza;

public class TestePizza {

	@Before
	public void limpaRegistroIngredientes() {
		Pizza p = new Pizza();
		p.zeraRegistroIngredientes(p);
	}
	
	@Test
	public void valorPizza() {
		Pizza p = new Pizza();
		p.adicionarIngrediente("tomate", 1);
		p.adicionarIngrediente("queijo", 1);
		assertEquals(15, p.getPreco());
		
	}
	@Test
	public void quantidadeIngredientesPizza() {
		Pizza p = new Pizza();
		p.adicionarIngrediente("tomate", 1);
		p.adicionarIngrediente("queijo", 1);
		assertEquals(2, p.getQtdIngredientes());
		
	}
	
	
	
}
