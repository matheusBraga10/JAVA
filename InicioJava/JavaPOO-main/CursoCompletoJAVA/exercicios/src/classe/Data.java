package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
//		dia = 1;
//		mes = 1; 
//		ano = 1970;
		this(1,1,1970);
		
//		byte, short, int long = 0;
//		float, double = 0;
//		boolean = false;
//		char, String = "";
//		Objetos = null;
		
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d\n";
		return String.format(formato, this.dia,mes,ano);
	}
	
//	static void teste() {
//		this.dia = 3; this é invalido para métodos estáticos
//	}
}
  