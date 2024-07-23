/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientehospital33;

/**
 *
 * @author matheus
 */
public class ClienteHospital33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Paciente p1 = new Paciente();
        p1.nome = "Marcos";
        p1.id = "123456789";
        p1.idade = 55;
        p1.logradouro = "Rua Duque de Caxias, 555";
        p1.emergencial = false;
        p1.ocorrencia = "Dor de cabeça e febre moderada";
        p1.status();
        p1.tipoAtendimento();
        
        System.out.println("");
        Paciente p2 = new Paciente();
        p2.nome = "Mauro";
        p2.id = "123456788";
        p2.idade = 13;
        p2.logradouro = "Rua Florestal, 645";
        p2.emergencial = true;
        p2.ocorrencia = "Acidente com fratura exposta";
        p2.status();
        p2.tipoAtendimento();
        
        System.out.println("");
        Paciente p3 = new Paciente();
        p3.nome = "Mario";
        p3.id = "123456787";
        p3.idade = 50;
        p3.logradouro = "Rua Dores de Almeida, 123";
        p3.emergencial = false;
        p3.ocorrencia = "Aparecimento de manchas na pale com dores e coçeira";
        p3.status();
        p3.tipoAtendimento();
    }
    
}
