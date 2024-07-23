/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula34;

/**
 *
 * @author matheus
 */
public final class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
 public Caneta(String m, String c, float p) { // Este é o MÉTODO CONSTRUTOR!!
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public boolean isTampada() {
        return tampada;
    }

    public Caneta(String modelo, float ponta, boolean tampada, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    
    public String getCor() {
        return this.cor;
    }
    public void setCor(String c) {
        this.cor = "Azul";
    }
    public boolean getTampada() {
        return this.tampada;
    }
    public void setTampada(boolean t) {
        this.tampada = t;
    }
    
    
    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
    
   }
