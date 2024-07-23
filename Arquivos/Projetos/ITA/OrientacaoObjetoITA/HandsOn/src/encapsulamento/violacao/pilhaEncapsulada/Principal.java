package encapsulamento.violacao.pilhaEncapsulada;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		p.empilhar("Eduardo");
		p.empilhar("Maria");
		p.empilhar("José");
		p.empilhar("João");
		p.empilhar("Miguel");
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
//		p.setTopo(6); É ERRADO, PELA LÓGICA DO CÓDIGO MUDARMOS ESSE VALOR, NESTE CASO ESPECÍFICO
//		PORTANTO DEIXAR O MÉTODO setTopo() DISPONÍVEL PARA USO NÃO É INTELIGENTE, NESTE CASO
		
		Object[] arrayElementos = p.getElementos();
		System.out.println(arrayElementos.length);
		arrayElementos[1] = "OUTRO";
		
		
//		Desempilhando
		System.out.println("--------------");
		System.out.println(p.desembpilhar());
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		System.out.println(p.getElementos().length);
		System.out.println(arrayElementos.length);
	}
}
