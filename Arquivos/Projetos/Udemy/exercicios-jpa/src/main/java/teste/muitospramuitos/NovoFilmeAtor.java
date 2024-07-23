package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		
		Filme filme1 = new Filme("Harry Potter 1", 4.8);
		Filme filme2 = new Filme("Harry Potter 2", 4.9);
		Filme filme3 = new Filme("Harry Potter 3", 4.7);
		
		Ator ator1 = new Ator("Hermione");
		Ator ator2 = new Ator("Sirius Black");
		
		filme1.adicionarAtor(ator1);
		
		filme2.adicionarAtor(ator2);
		filme2.adicionarAtor(ator1);

		filme3.adicionarAtor(ator2);
		
		
		DAO<Object> dao = new DAO<Object>();
		dao.incluirAtomico(filme1).fechar(); 
// Chamada somennte de "filme1". Porém adiciona todos os flmes e atores que estão interligados, por causa do cascade = CascadeType.PERSIST
	}
}
