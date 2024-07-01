package jogoDasPalavrasEmbaralhadas;

import java.util.Scanner;

import jogoDasPalavrasEmbaralhadas.embaralhadores.Embaralhador;
import jogoDasPalavrasEmbaralhadas.embaralhadores.FabricaEmbaralhadores;
import jogoDasPalavrasEmbaralhadas.mecanica.ErrouTerminou;
import jogoDasPalavrasEmbaralhadas.mecanica.FabricaMecanicaDoJogo;
import jogoDasPalavrasEmbaralhadas.mecanica.MecanicaDoJogo;
import jogoDasPalavrasEmbaralhadas.mecanica.TodasPalavras;
import jogoDasPalavrasEmbaralhadas.mecanica.Vida;

public class Principal {

	private static Scanner opcao;
	private static Scanner scanner;

	public static void main(String[] args) {



		        opcao = new Scanner(System.in);
		        scanner = new Scanner(System.in);
		        
		        System.out.println("===============================================================");
		        System.out.println("==================== ESCOLHA A MECÂNICA DO JOGO ===============");
		        System.out.println("1 - Errou perdeu.");
		        System.out.println("2 - O maior número de acertos.");
		        System.out.println("3 - Três vida e o jogo termina.");
		        System.out.println("===> ");
		        int numeroOpcao = opcao.nextInt();
			    switch(numeroOpcao){
			         case 1:
			            FabricaMecanicaDoJogo.set(new ErrouTerminou());
			            break;
			         case 2: 
			            FabricaMecanicaDoJogo.set(new TodasPalavras());
			            break;
			         case 3: 
			            FabricaMecanicaDoJogo.set(new Vida());
			            break;
			         default:
			            System.out.println("Opção invalida, programa terminado");
			            System.exit(0);
			         break;
			   } 


		        MecanicaDoJogo mecanicaDoJogo = FabricaMecanicaDoJogo.get();

		        System.out.println("*=============================================================*");
		        System.out.println("*=========================== START ===========================*");
		        System.out.println("Você vai jogar no modo: " + mecanicaDoJogo.getNome());
		        System.out.println("Descrição: " + mecanicaDoJogo.getDescricao());
		        System.out.println();
		        
		        while(!mecanicaDoJogo.isAcabou()){
		            String palavra = mecanicaDoJogo.getPalavra();
		            Embaralhador embaralhador = FabricaEmbaralhadores.getRandom();
		            String embaralhada = embaralhador.embaralhar(palavra);
		            
		            System.out.println("Adivinhe a palavra: " + embaralhada);
		            System.out.println("===> ");
		            String resposta = scanner.nextLine().toUpperCase();
		            String resultado = mecanicaDoJogo.tentativa(palavra, resposta);
		            System.out.println("Resultado: " + resultado);
		        }
		        
		        System.out.println(mecanicaDoJogo.getResultadoFinal());
		    }

}
