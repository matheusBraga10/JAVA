/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lacosaninhados;

/**
 *
 * @author matheus
 */
public class LacosAninhados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 3; i++) {
            System.out.print(i);
            for (int j = 0; j <= 2; j += 2) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
