/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca39;

/**
 *
 * @author matheus
 */
public class Heranca39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitante p1 = new Visitante();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista p5 = new Bolsista();
        Tecnico p6 = new Tecnico();
        
        p1.setNome("Juvenal");
        p1.setIdade(22);
        p1.setSexo("M");
        System.out.println(p1.toString());
        
        p2.setNome("Claudio");
        p2.setIdade(16);
        p2.setSexo("M");
        p2.setMatricula(123456);
        p2.setCurso("Infomrática");
        System.out.println(p2.toString());
        p2.pagarMensalidade(500);
        
        p3.setNome("Maria");
        p3.setIdade(40);
        p3.setSexo("F");
        p3.setEspecialidade("Matemática");
        p3.setSalario(2500.0f);
        p3.receberAumento(500.5f);
        System.out.println(p3.toString());
        
        p4.setNome("Vicentina");
        p4.setIdade(65);
        p4.setSexo("T");
        p4.setTrabalhando(false);
        System.out.println(p4.toString());
             
        p5.setMatricula(123457);
        p5.setNome("Jubileu");
        p5.setBolsa(12.5f);
        p5.setSexo("M");
        System.out.println(p5.toString());
        p5.pagarMensalidade(500.f);
        
        p6.setNome("Clarisse");
        p6.setIdade(20);
        p6.setSexo("F");
        p6.praticar();
        System.out.println(p6.toString());
    }
    
}
