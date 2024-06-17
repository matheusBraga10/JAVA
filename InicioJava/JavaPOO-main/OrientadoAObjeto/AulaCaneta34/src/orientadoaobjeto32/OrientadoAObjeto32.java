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
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
//        c1.ponta = 0.5f;
        c1.carga = 100;
//        c1.tampada = false;
        c1.destampar();
        c1.rabiscar();
        c1.status();
        
        System.out.println("");
        
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
    }
    
}
