package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {
	public static void main(String[] args) {
		DAO<Aluno> dao = new DAO<Aluno>();
		
		Aluno aluno1 = new Aluno (123L, "Matheus");
		AlunoBolsista aluno2 = new AlunoBolsista(234L, "Maria", 1000);
		
		dao.incluirAtomico(aluno1);
		dao.incluirAtomico(aluno2); 
		
		dao.fechar();
	}
}
