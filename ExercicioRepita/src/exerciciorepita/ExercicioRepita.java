/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, soma, totalValores, pares, impares, maior100, media;
        soma = 0;
        totalValores = 0;
        pares = 0;
        impares = 0;
        maior100 = 0;
        media = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: <br><em>(valor 0 interrompe)</em></html>"));
            soma += numero;
            totalValores++;
            if (numero % 2 == 0){
                pares++;
            } else {
                impares++;
            }
            if (numero > 100) {
                maior100++;
            }
            media = soma / totalValores;
        } while(numero != 0);
        JOptionPane.showMessageDialog(null, 
                "<html>Resultado final: <br><br><hr>" + "Somatório vale: <strong>" + soma + "</strong><br>" + 
                        "Total de valores: " + totalValores + "<br>" + 
                                "Total de pares: " + pares +"<br>" + 
                                        "Total de impares: " + impares + "<br>" + 
                                                "Acima de 100: " + maior100 + "<br>"
                                                        + "Média de valores: " + media + "</html>");
        
    }
    
}
