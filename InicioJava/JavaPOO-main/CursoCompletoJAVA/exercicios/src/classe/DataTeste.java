package classe;

import java.util.Scanner;

public class DataTeste {
	public static void main(String[] args) {
		Data data = new Data();
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o dia");
		data.dia = entrada.nextInt();
		
		System.out.println("Entre com o mês");
		data.mes = entrada.nextInt();
		
		System.out.println("Entre com o ano");
		data.ano = entrada.nextInt();
		
		String d = data.obterDataFormatada();
		System.out.println(d);
		
		
		entrada.close();
		
		Data d1 = new Data();
		Data d2 = new Data(15,1,24);
		
		System.out.printf("%d/%d/%d\n",d1.dia,d1.mes,d1.ano);
		System.out.printf("%d/%d/%d\n",d2.dia,d2.mes,d2.ano);
		
		
	}
}
