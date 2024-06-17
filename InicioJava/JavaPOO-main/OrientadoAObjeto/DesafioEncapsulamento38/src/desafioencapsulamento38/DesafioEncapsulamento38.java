/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafioencapsulamento38;

/**
 *
 * @author matheus
 */
public class DesafioEncapsulamento38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
       
        p[0] = new Pessoa("Matheus", 34, "29-12");
        p[1] = new Pessoa("Rogerio", 33, "10-10");
        
        
        l[0] = new Livro("RPG", "Mago",  3000, p[0]);
        l[1] = new Livro("Vampiro", "Dracula", 900, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        
        l[0].abrir();
        l[0].folhear(500);
        l[0].avancarPagina();
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
        
    }
    
        
        
    
    
}
