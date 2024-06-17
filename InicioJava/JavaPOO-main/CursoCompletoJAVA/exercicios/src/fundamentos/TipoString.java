package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá, pessoal".charAt(5));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");

		System.out.println(s.startsWith("boa"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equals("BOA TARDE"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";;
		var idade = 33;
		var salario = 1234.56;
		
		System.out.println();
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		System.out.println();
		System.out.printf("Nome: %s %s \nIdade: %d anos\nSalário: R$ %.2f", nome, sobrenome, idade, salario);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6,10)); 
		
	}
}
