/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturascondicionais;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class estruturasCondicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Estrutura de condição Simples */
        Scanner teclado1 = new Scanner(System.in);
        float nota1 = teclado1.nextFloat();
        float nota2 = teclado1.nextFloat();
        float media = (nota1 + nota2)/2;
        System.out.println("Sua média foi "+ media);
        if (media > 9){
            System.out.println("Parabens!");
        }
        /* Estrutura de condição Composta */
        System.out.print("Escreva o ano de nascimento de alguém: ");
        Scanner teclado2 = new Scanner(System.in);
        int anoNascimento = teclado2.nextInt();
        Calendar data = Calendar.getInstance();
        int ano = data.get(Calendar.YEAR);
        int  idade = ano - anoNascimento;
        if (idade >= 18){
            System.out.println("Essa pessoa é maior de idade. Ela possui " + idade + " anos de idade");
        }
        else{
            System.out.println("Essa pessoa ainda não completou a 18 anos. Faltam "+ (18 - idade) + " ano(s) para atingir a maior idade");
        }
        
    }
    
}
