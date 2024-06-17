/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca39;

/**
 *
 * @author matheus
 */
public class Funcionario extends Pessoa{
//    ATRIBUTOS
    private String setor;
    private boolean trabalhando;

//    METODOS
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
//    ESPECIAIS
    public void mudarTrabalho() {
        this.trabalhando =! this.trabalhando;
    }
}
