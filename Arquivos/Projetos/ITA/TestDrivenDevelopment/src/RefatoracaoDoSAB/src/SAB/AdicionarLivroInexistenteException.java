package RefatoracaoDoSAB.src.SAB;

@SuppressWarnings("serial")
public class AdicionarLivroInexistenteException extends Exception {
	public AdicionarLivroInexistenteException(String message)
    {
       super(message);
    }
}