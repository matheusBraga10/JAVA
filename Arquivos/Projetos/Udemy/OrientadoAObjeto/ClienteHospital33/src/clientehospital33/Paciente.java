/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientehospital33;

/**
 *
 * @author matheus
 */
public class Paciente {
    String nome;
    String logradouro;
    int idade;
    String id;
    String ocorrencia;
    boolean emergencial;
    
    void status() {
        System.out.println("Paciente nome: " + this.nome);
        System.out.println("Endereço: " + this.logradouro);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.id);
        System.out.println("Motivo da ocorrencia: " + this.ocorrencia);
    }
    void tipoAtendimento() {
        if (this.emergencial == true) {
            System.out.println("Emergência! O atendimento é urgente!");
        } else {
            System.out.println("O atendimento é por ordem de chegada, \nretire seu numero de atendimento no terminal.\n Em breve você será chamado.");            
        }
    }
    
}
