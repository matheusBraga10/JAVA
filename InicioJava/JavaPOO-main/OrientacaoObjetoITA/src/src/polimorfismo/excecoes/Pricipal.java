package polimorfismo.excecoes;

public class Pricipal {

	public static void main(String[] args) throws Exception {
		a(-100);
		System.out.println("terminando a execução de main() ");
	}

	public static void a(int i) throws Exception {
		System.out.println("executando a() com "+i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("tratando a exeção: " + e.getMessage());
		}
		System.out.println("terminando execução de a() ");
	}
	
	public static void b (int i ) throws Exception {
		System.out.println("executando b() com "+i);
		if(i>0) {
			throw new Exception("mensagem");
		}
		System.out.println("terminando a execução de b() ");
	}
}

/* STACK TRACE SEM USO DO TRY CATCH:
 * 
 * executando a() com 100Exeption in thread "main"
 * executando b() com 1000
 * java.lang.Exception: mensagem
 * 		at Principal.b(Principal.java:22)
 * 		at Principal.a(Principal.java:13)
 * 		at Principal.main(Principal.java:6)
 * 
 */