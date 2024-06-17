package teste.composicao;

import infra.DAO;
import modelo.composicao.Endereco;
import modelo.composicao.Fornecedor;
import modelo.composicao.Funcionario;

public class NovoEndereco {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Av. A", "n:101");
		Endereco endereco2 = new Endereco("Av. B", "n:22");
		
		Fornecedor fornecedor1 = new Fornecedor();
		fornecedor1.setNome("Empresas SA");
		fornecedor1.setEndereco(endereco2);;
		Fornecedor fornecedor2 = new Fornecedor();
		fornecedor2.setNome("Clube B");
		fornecedor2.setEndereco(endereco1);;

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Matheus");
		funcionario1.setEndereco(endereco2);;

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Mario");
		funcionario2.setEndereco(endereco1);
		
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao().incluir(fornecedor1)
			.incluir(fornecedor2).incluir(funcionario1).incluir(funcionario2)
			.fecharTransacao().fechar();
		
	}
}
