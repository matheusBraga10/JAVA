/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author matheus
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int n[] = new int[4]; Ou
          int n[] = {3,2,8,5};
          System.out.println("Total de casas de N " + n.length);
          for(int c=0; c<=n.length-1; c++) {
            if (c != n.length-1)  {
            System.out.print(n[c] + ", ");
            } else {
                System.out.println(n[c] + ".");
            }
            
          }
          
          int year = 2024;
          
          String mes[] = {"Janeiro", "Fevereiro","Março","Abril","Maio","Junho",
              "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
          int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
          int bissexto[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
          for (int i = 0; i< mes.length; i++) {
              if (year % 4 == 0) {
                  System.out.println("O mes de " + mes[i] + " tem " + bissexto[i] + " dias.");
              } else{
              System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias.");
              }
          }
          
//          FOR IT
        int num[] = {3,5,1,8,4};
        Arrays.sort(num);
        for (int valor : num) {
            if (valor < 8) {
                System.out.print(valor + ", ");
            } else {
                System.out.println(valor + ".");
            }
        }
        
//        Busca de numeros em vetores
        int lista [] = {5,3,1,8,4};
        int posicao = Arrays.binarySearch(lista, 1);
        System.out.println("O valor 1, dentro do vetor, está localizado na posição " + posicao);
                  
        int lista1[] = new int[50];
        
        Arrays.fill(lista1, 0); // Preenche a lista com valor pré definido "0" ou outro;
        for (int valor: lista1) {
            System.out.print(valor + " ");
                
            
        }
                
    }
    
    
}
