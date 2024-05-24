/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo40;

/**
 *
 * @author matheus
 */
public class Polimorfismo40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldFish = new GoldFish();
        Arara arara = new Arara();
        Lobo lobo = new Lobo();
        
        cachorro.reagir("Olá");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(11, 45);
        cachorro.reagir(22, 00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2,12.5f);
        cachorro.reagir(17,4.5f);
        lobo.emitirSom();
        cachorro.emitirSom();
        
    }
    
}
