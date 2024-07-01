package jogoDasPalavrasEmbaralhadas.mecanica;

import jogoDasPalavrasEmbaralhadas.dados.BancoDePalavras;

public class Vida implements MecanicaDoJogo {

	private int numeroPalavrasErradas = 3;
	private BancoDePalavras bancoDePalavras = new BancoDePalavras();
    private int pontos = 0;
    
    @Override
    public String getNome() {
        return "Acerta o maior número de palavras sem morrer.";
    }

    @Override
    public String getDescricao() {
        return "A cada palavra errada você perderá uma vida, quando sua vida chegar a 0 o jogo termina.";
    }

    @Override
    public boolean isAcabou() {
        if(numeroPalavrasErradas <= 0){
            return true;
        }
       return false;
    }

    @Override
    public String getPalavra() {
        return bancoDePalavras.palavraAleatoria();
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(resposta.equals(palavra)){
            pontos++;
            return "Você acertou, muito bem!.... Continue com o jogo!!!\n --> ++1 ponto <--";
        } else{
            numeroPalavrasErradas--;
            return "Que pena você não conseguiu, mas podemos tentar outra palavra.\n -> Resta: " + numeroPalavrasErradas + " vidas.";
        }
    }

    @Override
    public String getResultadoFinal() {
        
        String result = pontos < 2 ? "\nVocê é muito ruim!!!\n Total de pontos: " + pontos : "\nParabéns: \n Total de pontos: " + pontos;
        
        return result;
    }
}
