/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamentocontroleremoto36;

/**
 *
 * @author matheus
 */
public class ControleRemoto implements Controlador{
//    ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;
//    MÉTODOS ESPECIAIS
//      Construtor
    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }
//      Gets and Sets
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
//  METODOS ABSTRATOS
    @Override
    public void ligar() {
        this.setLigado(true);
        this.setVolume(50);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setVolume(0);
        this.setTocando(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado() == true) {
            System.out.println("----- MENU -----");
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println("");
        } else {
            System.out.println("O aparelho não está ligado.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 5);
        } 
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
    
}
