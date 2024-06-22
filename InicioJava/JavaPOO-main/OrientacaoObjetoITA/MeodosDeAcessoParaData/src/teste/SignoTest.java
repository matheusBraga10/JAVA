package teste;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import metodosDeAcessoParaData.FormataDataEmSignos;
import metodosDeAcessoParaData.Pessoa;
import metodosDeAcessoParaData.Signo;

public class SignoTest {


	@Test
	public void testSignoCapricornio() {
		Pessoa pessoa;
		FormataDataEmSignos formataDataEmSignos;
		pessoa = new Pessoa(LocalDate.of(1999, 1, 15));
		formataDataEmSignos = new Signo();
		assertEquals("Capricornio", formataDataEmSignos.formataSignos(pessoa.getDataDeNascimento()));
	}
	@Test
	public void testSignoGemeos() {
		Pessoa pessoa;
		FormataDataEmSignos formataDataEmSignos;
		pessoa = new Pessoa(LocalDate.of(1989, 5, 29));
		formataDataEmSignos = new Signo();
		assertEquals("Gêmeos", formataDataEmSignos.formataSignos(pessoa.getDataDeNascimento()));
	}
	@Test
	public void testSignoTouro() {
		Pessoa pessoa;
		FormataDataEmSignos formataDataEmSignos;
		pessoa = new Pessoa(LocalDate.of(1991, 5, 20));
		formataDataEmSignos = new Signo();
		assertEquals("Touro", formataDataEmSignos.formataSignos(pessoa.getDataDeNascimento()));
	}
	@Test
	public void testSignoLibra() {
		Pessoa pessoa;
		FormataDataEmSignos formataDataEmSignos;
		pessoa = new Pessoa(LocalDate.of(1988, 10, 7));
		formataDataEmSignos = new Signo();
		assertEquals("Libra", formataDataEmSignos.formataSignos(pessoa.getDataDeNascimento()));
	}


}
