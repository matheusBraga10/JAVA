package experienciaAcesso.outro;

import experienciaAcesso.pacote.Referencia;

public class Sub extends Referencia{
	
	public Sub() {
		// TODO Auto-generated constructor stub
	}

	public void testeAcesso() {
		Referencia r = new Referencia();
//		r.modificadorDefaut = 0;
		r.modificadorPublico = 0;
//		r.modificadorProtegido = 0; // DÁ ERRO MAS NÃO DEVERIA! (ATUALIZAÇÃO JAVA?)
//		r.modificadorPrivado = 0;
	}
}
