/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioencapsulamento38;

/**
 *
 * @author matheus
 */
public class Pessoa {
//    ATRIBUTOS
    private String nome;
    private int idade;
    private String dataNacimento;
    
//    METODOS
//    Getter and Setter


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }
    
    
//    Personalizados
    
    public void fazerAniversario() {
        if ("29-12".equals(this.getDataNacimento())) {
            System.out.println("Feliz aniversário " + this.getNome());
            this.setIdade(this.getIdade() +1);
        } else {
            System.out.println("");
        }
    }

    public Pessoa(String nome, int idade, String dataNacimento) {
        this.nome = nome;
        this.idade = idade;
        this.dataNacimento = dataNacimento;
    }
    
    
}
