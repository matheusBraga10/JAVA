/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author matheus
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        WHILE (ENQUANTO)

        int contador1 = 1;
        while (contador1 <= 20) {
            System.out.println("Cabalhota " + contador1);   
            contador1 ++;
        }
        int contador2 = 0;
        while (contador2 < 10) {
            contador2 ++;
            if (contador2 == 5 || contador2 == 7) {
                continue; //Pula a condição
            }
            System.out.println(contador2);
        }
        int contador3 = 0;
        while (contador3 < 10) {
            contador3 ++;
            if (contador3 == 2 || contador3 == 7) {
                continue; //Pula a condição
            }
            if (contador3 == 9)
                break; //Para a execução de acordo com a condição
            System.out.println(contador3);
        }
//        DO (REPITA ENQUANTO)

        int contador4 = 0;
        do {
            System.out.println("Contagem " + contador4);
            contador4++;
        } while (contador4 < 4);
//        FOR (PARA)

        for (int contador5 = 0; contador5 <=3; contador5++) {
            System.out.println("Backflip" + contador5);
        }
        for (int contador6 = 50; contador6 >= 5; contador6-=5) {
            System.out.println("frontflip" + contador6);
        }
        for (int contador7 = 1; contador7 <= 101; contador7 +=10) {
            System.out.println("frontflip" + contador7);
        }
    } 
}
