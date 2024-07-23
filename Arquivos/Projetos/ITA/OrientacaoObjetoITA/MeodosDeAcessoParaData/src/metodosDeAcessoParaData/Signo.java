package metodosDeAcessoParaData;

import java.time.LocalDate;

public class Signo implements FormataDataEmSignos {

	@Override
	public String formataSignos(LocalDate localDate) {
		int dia = localDate.getDayOfMonth();
		int mes = localDate.getMonthValue();
		
		if ((mes==1 &&  dia>=21) || (mes==2 && dia<=19)) {
			return "Aquario";
		} else if ((mes==2 && dia>=20) || (mes==3 && dia<=20)) {
			return  "Peixes";
		} else if ((mes==3 && dia>=21) || (mes==4 && dia<=20)) {
			return "Áries";
		} else if ((mes==4 && dia>=21) || (mes==5 && dia<=20)) {
			return "Touro";
		} else if ((mes==5 && dia>=21) || (mes==6 && dia<=20)) {
			return "Gêmeos";
		} else if ((mes==6 && dia>=21) || (mes==7 && dia<=21)) {
			return "Cancêr";
		} else if ((mes==7 && dia>=22) || (mes==8 && dia<=22)) {
			return "Leão";
		} else if ((mes==8 && dia>=23) || (mes==9 && dia<=22)) {
			return "Virgem";
		} else if ((mes==9 && dia>=23) || (mes==10 && dia<=22)) {
			return "Libra";
		} else if ((mes==10 && dia>=23) || (mes==11 && dia<=21)) {
			return "Escorpião";
		} else if ((mes==11 && dia>=22) || (mes==12 && dia<=21)) {
			return "Sagitario";
		} else if ((mes==12 && dia>=22) || (mes==1 && dia<=20)) {
			return "Capricornio";
		} else {
			return "Erro. Data ou mês informado não válido.";
		}
	}

}
