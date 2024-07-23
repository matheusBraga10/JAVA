package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		
		Monstro monster = new Monstro(50,51);

		Heroi hero = new Heroi(50, 50);
		
		System.out.println("Vida do monstro " + monster.vida);
		System.out.println("Vida do heroi " + hero.vida);
		
		monster.atacar(hero);
		
		System.out.println("Vida do monstro " + monster.vida);
		System.out.println("Vida do heroi " + hero.vida);
		
		hero.atacar(monster);
		
		System.out.println("Vida do monstro " + monster.vida);
		System.out.println("Vida do heroi " + hero.vida);
		
		hero.andar(Direcao.SUL);
		monster.andar(Direcao.NORTE);
		
		hero.posicao();
		monster.posicao();
		
	}
}
