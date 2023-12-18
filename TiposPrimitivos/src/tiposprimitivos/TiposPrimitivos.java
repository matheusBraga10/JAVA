/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome =  teclado.nextLine();  
        System.out.println("Digite sua nota");
        float nota = teclado.nextFloat();
        System.out.println("A nota é " + nota);
        System.out.format("A nota de %s é %.2f \n",nome, nota);
        int idade = 30;
        // Transformando valores inteiros para string
        String valor = Integer.toString(idade);
        System.out.println(valor);
        // Transformando valores string para inteiros
        String valor1 = "30";
        int idade1  = Integer.parseInt(valor1);
        System.out.println(idade1);
        // Transformando valores string para float
        String valor2 = "30.9";
        float idade2  = Float.parseFloat(valor2);
        System.out.format("%.3f \n",idade2);
    }
    
}
