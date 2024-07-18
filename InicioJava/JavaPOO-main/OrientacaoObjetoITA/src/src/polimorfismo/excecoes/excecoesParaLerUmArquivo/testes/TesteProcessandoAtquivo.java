package polimorfismo.excecoes.excecoesParaLerUmArquivo.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import polimorfismo.excecoes.excecoesParaLerUmArquivo.arquivos.ProcessandoArquivo;

public class TesteProcessandoAtquivo {

	ProcessandoArquivo processandoArquivo = new ProcessandoArquivo();
	
	@Test
	public void testeArquivo1() throws Exception {
		
		assertEquals("{idade= 35, nome=Matheus Felipe, sobrenome= Braga}",
				processandoArquivo.processar("Arquivo1").toString());
	}
}

