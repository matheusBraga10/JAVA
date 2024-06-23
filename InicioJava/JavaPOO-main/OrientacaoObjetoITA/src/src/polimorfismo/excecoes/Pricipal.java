package polimorfismo.excecoes;

public class Pricipal {

	public static void main(String[] args) throws Exception {
		a(100);
		System.out.println("terminando a execução de main() ");
	}

	public static void a(int i) throws Exception {
		System.out.println("executando b() com "+i);
		try {
			b(100);
		} catch (Exception e) {
			System.out.println("tratando a exeção: " + e.getMessage());
		}
			
		
	}
	
	public static void b (int i ) throws Exception {
		System.out.println("executando b() com "+i);
		if(i>0) {
			throw new Exception("mensagem");
		}
		System.out.println("executando b() com "+i);
	}
}

