package polimorfismo.excecoes.excecoesParaLerUmArquivo.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProcessandoArquivo {
	
	
	public Map<String, String> processar(String nomeArquivo) throws Exception {
		Map<String, String> informacoes = new HashMap<>();
		try {
			File file = new File("C:\\Users\\mathe\\Documents\\Estudos\\"
					+ "JAVA\\InicioJava\\JavaPOO-main\\OrientacaoObjetoITA\\"
					+ "src\\src\\polimorfismo\\excecoes\\excecoesParaLerUmArquivo\\"
					+ "arquivos\\"+nomeArquivo+".txt");
			FileReader fileReader = new FileReader(file);
			try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
				String linha = bufferedReader.readLine();
				String infoLinha[] = linha.split(";");
				while(linha != null) {
					informacoes.put("nome", infoLinha[0]);
					informacoes.put("sobrenome", infoLinha[1]);
					informacoes.put("idade", infoLinha[2]);
					linha = bufferedReader.readLine();
					for (String key : informacoes.keySet()) {
						String value = informacoes.get(key);
						System.out.println(key + "-> "  + value);
					}
					System.out.println();
				}
			}
		} catch(IOException LeituraArquivoException) {
			if(informacoes.isEmpty()) {
				throw new Exception("Arquivo vazio");
			} else if(nomeArquivo.isBlank()) {
				throw new Exception("Formato de arquivo inválido.");
			} else {
			throw new Exception("Erro ao abrir o arquivo.");
			}
		}
		return informacoes;
	}

	
	
}
