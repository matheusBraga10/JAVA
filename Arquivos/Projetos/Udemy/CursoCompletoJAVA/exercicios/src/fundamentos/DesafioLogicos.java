package fundamentos;


public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalhoTerca, trabalhoQuinta;
		
		trabalhoQuinta = false;
		trabalhoTerca = false;
		 
		System.out.println("TV de 50 polegadas foi comprada? " + (trabalhoTerca && trabalhoQuinta));
		System.out.println("TV de 32 polegadas foi comprada? " + (trabalhoTerca ^ trabalhoQuinta));
		System.out.println("A fammilia tomou sorvete no shopping? " + (trabalhoTerca || trabalhoQuinta)); 
	}
}
