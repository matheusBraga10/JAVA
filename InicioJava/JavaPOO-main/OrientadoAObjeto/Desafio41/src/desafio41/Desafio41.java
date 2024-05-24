/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio41;

/**
 *
 * @author matheus
 */
public class Desafio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Video video[] = new Video[3];
        video[0] = new Video("Aula 1 de POO");
        video[1] = new Video("Aula 2 de JAVA");
        video[2] = new Video("Aula 3 de PHP");
        
//        System.out.println(video[0].toString());
        
        Gafanhoto gafanhoto[] = new Gafanhoto[3];
        gafanhoto[0] = new Gafanhoto("Jubileu", 22, "M", "juba13");
        gafanhoto[1] = new Gafanhoto("Jacob", 27, "M", "***_1efg3vh");
        gafanhoto[2] = new Gafanhoto("Maria", 75, "F", "maw45opjga");
        
//        System.out.println(gafanhoto[2].toString());
        Visualizacao visualizacao[] = new Visualizacao[5];
        visualizacao[0] = new Visualizacao(gafanhoto[0], video[2]);
        visualizacao[0].avaliar();
        visualizacao[1] = new Visualizacao(gafanhoto[0], video[1]);
        visualizacao[1].avaliar(35.5f);
        visualizacao[2] = new Visualizacao(gafanhoto[0], video[0]);
        visualizacao[2].avaliar(10);
        visualizacao[3] = new Visualizacao(gafanhoto[1], video[2]);
        visualizacao[4] = new Visualizacao(gafanhoto[2], video[2]);
        
        System.out.println(visualizacao[0].toString());
        System.out.println("");
        System.out.println(visualizacao[1].toString());
        System.out.println("");
        System.out.println(visualizacao[2].toString());
        System.out.println("");
        System.out.println(visualizacao[3].toString());
        System.out.println("");
        System.out.println(visualizacao[4].toString());
        
        
    }
   
}
