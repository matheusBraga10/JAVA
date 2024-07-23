package calculoIMC;

public class Paciente {
	private double peso;
	private double altura;
	private double calcIMC;
	
	

	public Paciente(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	
	public String diagnostico() {
		
		String string = "";
		if(getCalcIMC() < 16) {
			string ="Baixo peso muito grave - IMC abaixo de 16 kg/m²";
		}
		else if(getCalcIMC() < 17) {
			string ="Baixo peso grave - IMC entre 16 e 16,99 kg/m²"; 
		}
		else if(getCalcIMC() < 18.5) {
			string ="Baixo peso - IMC entre 17 e 18,49 kg/m²"; 
		}
		else if(getCalcIMC() < 25) {
			string ="Peso normal - IMC entre 18,50 e 24,99 kg/m²"; 
		}
		else if(getCalcIMC() < 30) {
			string ="Sobrepeso - IMC entre 25 e 29,99 kg/m²"; 
		}
		else if(getCalcIMC() < 35) {
			string = "Obesidade grau I - IMC entre 30 e 34,99 kg/m²"; 
		}
		else if(getCalcIMC() < 40) {
			string = "Obesidade grau II - IMC entre 35 e 39,99 kg/m²"; 
		}
		else{
			string = "Obesidade grau III (obesidade mórbida) - IMC igual ou maior que 40 kg/m²"; 
		}
		return string;
	}
	
	public double calcularIMC() {
		calcIMC = getPeso()/(getAltura()*getAltura());
		return calcIMC;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getCalcIMC() {
		return calcIMC;
	}
	public void setCalcIMC(double calcIMC) {
		this.calcIMC = calcIMC;
	}
	
	
}
