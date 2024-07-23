/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo40;

/**
 *
 * @author matheus
 */
public class Canguru extends Mamifero{
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
    
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
}
