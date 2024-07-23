/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientadoaobjeto32;

/**
 *
 * @author matheus
 */
public class OrientadoAObjeto32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println("");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Prodemge";
        c2.cor = "Preta";
        c2.ponta = 1.0f;
        c2.carga = 100;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
