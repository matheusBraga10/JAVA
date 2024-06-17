package oo.heranca;

public class Jogador {
	
	public int vida = 10;
	protected int posicaoX;
	protected int posicaoY;
	
	protected Jogador(int posicaoX, int posicaoY) {
		super();
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}

	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(posicaoX - oponente.posicaoX);
		int deltaY = Math.abs(posicaoY- oponente.posicaoY);
		
		if((deltaX == 1 && deltaY == 0) || (deltaX == 0 && deltaY == 1)) {
			oponente.vida -= 1;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			posicaoY++;
			break;
		case SUL:
			posicaoY--;
			break;
		case LESTE: 
			posicaoX++;
			break;
		case OESTE: 
			posicaoX--;
			break;
		}
		return true;
	}
	
	public void posicao() {
		System.out.println("X = " + posicaoX + " | Y = " + posicaoY);
	}
}
