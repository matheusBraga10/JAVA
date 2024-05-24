/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamentoentreclasses37;

import java.util.Random;

/**
 *
 * @author matheus
 */
public class Luta {
//    ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
//    MÉTODOS
//      Getter and Setter

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }



//      Personalizados
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("::: DESAFIADO :::");
            this.getDesafiado().apresentar();
            System.out.println("::: DESAFIANTE :::");
            this.getDesafiante().apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println( this.desafiado.getNome() + " ganhou");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: 
                    System.out.println(this.desafiante.getNome() + " ganhou");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    
}
