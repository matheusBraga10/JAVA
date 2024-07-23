package jogoDasPalavrasEmbaralhadas.mecanica;

import jogoDasPalavrasEmbaralhadas.dados.BancoDePalavras;

public class TodasPalavras implements MecanicaDoJogo{

	private static int numeroDePalavras = 0;
    private BancoDePalavras bancoDePalavras = new BancoDePalavras();
    private String palavraSorteada = bancoDePalavras.palavraAleatoria();
    private int pontos = 0;
    private int restante = bancoDePalavras.getTamanho();
    
    @Override
    public String getNome() {
        return "Acerta o maior número de palavras possiveis.";
    }

    @Override
    public String getDescricao() {
        return "Cada palavra certa você ganhara 10 de ponto e a cada palavra errada menos 5 pontos.";
    }

    @Override
    public boolean isAcabou() {
       return numeroDePalavras == bancoDePalavras.getTamanho() ? true : false;
    }

    @Override
    public String getPalavra() {
        return palavraSorteada;
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)){
            pontos += 10;
            numeroDePalavras++;
            palavraSorteada = bancoDePalavras.palavraAleatoria();
            return "Você acertou, muito bem!.... Continue com o jogo!!!\n --> ++10 <-- " + "Falta " + (restante -numeroDePalavras) + " palavras.";
        }else{
            pontos -= 5;
            numeroDePalavras++;
            return "Que pena você não conseguiu, mas pode tanta de novo com a mesma palavra!\n --> -5 <-- " + "Falta " + (restante - numeroDePalavras) + " palavras.";
        }
    }

    @Override
    public String getResultadoFinal() {
        
        String result = pontos < 0 ? "\nVocê e muito ruim mlk!!!\n Total de pontos: " + pontos : "\nParabéns: \n Total de pontos: " + pontos;
        
        return result;
    }
}
