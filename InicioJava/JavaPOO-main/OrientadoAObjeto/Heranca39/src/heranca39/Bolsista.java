/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca39;

/**
 *
 * @author matheus
 */
public class Bolsista extends Aluno{
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    @Override
    public void pagarMensalidade(float mensalidade) {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado!");
        System.out.println("Mensalidade total: R$ " + mensalidade);
        mensalidade -=  (mensalidade*this.getBolsa())/100;
        System.out.println("Mensalidade com desconto: R$ " + mensalidade);
    }
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
}
