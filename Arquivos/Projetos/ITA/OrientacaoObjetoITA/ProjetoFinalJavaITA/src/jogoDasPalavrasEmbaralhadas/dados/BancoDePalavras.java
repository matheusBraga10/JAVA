package jogoDasPalavrasEmbaralhadas.dados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDePalavras {
	
	List<String> lista = new ArrayList<>();
	
	public List<String> leitor() throws IOException {
		try {
			File file = new File("C:\\Users\\mathe\\Documents\\Estudos\\JAVA\\InicioJava\\JavaPOO-main\\OrientacaoObjetoITA\\ProjetoFinalJavaITA\\src\\jogoDasPalavrasEmbaralhadas\\dados\\dados.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String linha = bufferedReader.readLine();
			while(linha != null) {
				lista.add(linha);
				linha = bufferedReader.readLine();
			}
			} catch(IOException exception) {
			System.out.println("Erro. Arquivo não encontrado.");
			}
		return lista;
	}
    
	public String palavraAleatoria() {
		try {
			lista = leitor();
		} catch (IOException a) {
			Logger.getLogger(BancoDePalavras.class.getName()).log(Level.SEVERE, null, a);
		}
		Random random = new Random(System.currentTimeMillis());
		int sorteada = random.nextInt();
		int sorte = sorteada % (lista.size());
		
		return lista.get(Math.abs(sorte));
	}
	
	public int getTamanho() {
		return lista.size();
	}
}
