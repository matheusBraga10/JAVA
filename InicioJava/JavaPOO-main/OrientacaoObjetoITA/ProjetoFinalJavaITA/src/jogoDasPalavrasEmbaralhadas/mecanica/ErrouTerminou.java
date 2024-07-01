package jogoDasPalavrasEmbaralhadas.mecanica;

import jogoDasPalavrasEmbaralhadas.dados.BancoDePalavras;

public class ErrouTerminou implements MecanicaDoJogo{
	
	private boolean errou = false;
    private BancoDePalavras palavras = new BancoDePalavras();
    private int numeroPalavrasCertas = 0;
    
    @Override
    public String getNome() {
        return "Erro. Você perdeu!";
    }

    @Override
    public String getDescricao() {
        return "Se você errar a palavra o jogo termina!";
    }

    @Override
    public boolean isAcabou() {
        return errou;
    }

    @Override
    public String getPalavra() {
        return palavras.palavraAleatoria();
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            numeroPalavrasCertas++;
            return "Acertou. Parabéns!";
        }else{
            errou = true;
            return "Você errou!!!";
        }
    }

    @Override
    public String getResultadoFinal() {
        return "\nTotal de pontos: " + numeroPalavrasCertas;
    }
}
