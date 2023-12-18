/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author matheus
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, resultado;
        n1 = 14;
        n2 = 8;
        resultado = (n1 > n2) ? n1 +n2 : n1-n2;
        System.out.println(resultado);
        
        String nome1 = "Matheus";
        String nome2 = "Matheus";
        String nome3 = new String("Matheus");
        String result, result1;
        result = (nome1 == nome2)?"igual":"diferente";
        System.out.println(result);
        result1 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(result1);
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y || y==z)?true:false;
        System.out.println(r);
        
        boolean val1 = (4>=5), val2 = (4<4), val3 = (val1 == val2);
        boolean val4 = val1 ^ val3; /* Operador "ou exclusivo" */
        boolean val5 = !val2 && val4;
        System.out.println(val4 + " " + val5);
    }
    
}
