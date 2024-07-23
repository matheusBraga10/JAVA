/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulacontabanco35;

/**
 *
 * @author matheus
 * 
 * Jubileu e Creusa tem contas abertas no banco
 * 
 * Jubileu tem conta polpança e depositou 300,00
 * 
 * Creusa tem conta corrente e depositou 500,00
 *  - Precisou de 100,00 para comprar um sapato
 */
public class AulaContaBanco35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta("0123-1");
        p1.setDonoConta("Jubileu");
        p1.abrirConta("cc");
        p1.depositarConta(300);
        p1.sacarConta(350);
        p1.fecharConta();
        
        ContaBanco p2= new ContaBanco();
        p2.setNumConta("0123-2");
        p2.setDonoConta("Creuza");
        p2.abrirConta("cp");
        p2.depositarConta(500);
        p2.sacarConta(1000);
        
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
    }
    
}
