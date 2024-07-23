package classe;

public class ValorNulo {
	public static void main(String[] args) {
	
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
//		 NÃO É POSSÍVEL ACESSAR UM ATRIBUTO OU MÉTODO DE ALGO QUE ESTÁ NULO! (ALGO QUE NÃO APONTA PARA UM ENDEREÇO DE MEMORIA)
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		if(d1 != null) {
		d1.mes = 3;
		System.out.println(d1.obterDataFormatada());
		}
		String s2 = Math.random() > 0.5 ? "" : null;
		if(s2 !=null) {
		System.out.println(s2.concat("???"));
		}
		
	}
	
}
