package estruturasDeControle;

public class switchSemBreak {
	public static void main(String[] args) {
		String faixa = "marrom";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Sandan");
		case "amarela":
			System.out.println("Sei o Heian Nidan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		;
		
	}
}
