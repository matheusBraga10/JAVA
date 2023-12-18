/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, soma = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um numero: ");
            numero = teclado.nextInt();
            soma += numero;
            System.out.print("Quer continuar? [S/N]");
            resposta = teclado.next();
        } while (resposta.equals("S"));
        System.out.println("A soma de todos os valores é " + soma);
    }
    
}
