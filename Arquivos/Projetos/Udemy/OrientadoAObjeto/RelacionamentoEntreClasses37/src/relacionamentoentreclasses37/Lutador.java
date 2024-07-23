/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamentoentreclasses37;

/**
 *
 * @author matheus
 */
public class Lutador implements Acao{
//    ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
//    ATRIBUTOS ESPECIAIS
//      Construtor

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

//      Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
//  METODOS PERSONALIZADOS
    @Override
    public void apresentar() {
        System.out.println("-----------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " metros de altura");
        System.out.println("Pesando " + this.getPeso() + " kg");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
    }

    @Override
    public void status() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println(this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getEmpates() + " empates");
        System.out.println(this.getDerrotas() + " derrotas");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() +1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() +1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
}
