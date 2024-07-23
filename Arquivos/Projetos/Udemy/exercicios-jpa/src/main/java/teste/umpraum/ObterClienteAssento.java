package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<Cliente>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorID(1L);
		System.out.println(cliente.getAssento().getNome());

		DAO<Assento> daoAssento= new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorID(4L);
		System.out.println(assento.getCliente().getNome());
		
		System.out.println(cliente.getAssento().getCliente().getNome());
		
		daoCliente.fechar();
		daoAssento.fechar();
	} 
}

/*
 * O mapeamento relação 'one to one' está mapeado no 
 * atributo 'assento' que pertence a classe 'Cliente', 
 * e essa é a forma de criar uma relação bidirecional 
 * um para um
 * */