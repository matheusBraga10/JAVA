package excecao;

public class ChecadaVsNaoChegada {
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		} // Não basta somente lançar o erro, existe uma palavra reservada chamada throw que lança o erro com a mensagem descrita
		
		System.out.println("Fim!");
	}
//	Exceção não checada ou não verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
//	Exceção checada ou verificada
	static void geraErro2() throws Exception{
		try {
			throw new Exception("Ocorreu um erro bem legal #02");
		} catch (Exception e) {
			System.out.println("Que legal");
		}
		
	}
}
