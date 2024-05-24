/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulacontabanco35;

/**
 *
 * @author matheus
 * 
 * Cc - conta corrente = ganha 50,00 ao abrir a conta (12,00 de mensalidade)
 * Cp - conta poupança = ganha 150,00 ao abrir a conta (20,00 de mensalidade)
 * 
 * 
 */
public class ContaBanco {
    
//    ATRIBUTOS
    public String numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;
    

    
    
//   MÉTODOS PERSONALIZADOS
    public void estadoAtual() {
        System.out.println("=============================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Proprietário: " + this.getDonoConta());
        System.out.println("Saldo: " + this.getSaldoConta());
        System.out.println("Status: " + this.getStatusConta());
        System.out.println("=============================");
        System.out.println("");
        
    }
    public void abrirConta(String tipoConta) {
        this.setTipoConta(tipoConta);
        this.setStatusConta(true);
        if (null == tipoConta) {
            System.out.println("Erro!\nInforme:\n- cc para Conta corrente\n- cp para Conta polpança");
        } else switch (tipoConta) {
            case "cc":
                this.setSaldoConta(50.00f);
                System.out.println("Conta aberta com sucesso");
                break;
            case "cp":
                this.setSaldoConta(150.00f);
                System.out.println("Conta aberta com sucesso");
                break;
            default:
                System.out.println("Erro!\nInforme:\n- cc para Conta corrente\n- cp para Conta polpança");
                break;
        }
    }
    public void fecharConta() {
        if (this.getSaldoConta() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
        } else if (this.getSaldoConta() < 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem débito");
        } else {
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositarConta(float valor) {
        if (this.getStatusConta()) {
            this.setSaldoConta(this.getSaldoConta() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDonoConta());
        } else {
            System.out.println("Impossível depositar em uma conta inativada ou inexistente");
        }
    }
    public void sacarConta(float valor) {
        if (this.getStatusConta()) {
            if (this.getSaldoConta() >= valor) {
                this.setSaldoConta(this.getSaldoConta() - valor);
                System.out.println("Saque realizado na conta de " + this.getDonoConta());
            } else {
                System.out.println("Saldo insuficiente para saque");
            } 
        } else {
            System.out.println("Impossível sacar de uma conta inativa ou inexistente");
        }
    }
    public void pagarMensal() {
        float valor = 0;
        if (null == this.getTipoConta()) {
            if (this.getStatusConta()) {
                this.setSaldoConta(this.getSaldoConta() - valor);
                System.out.println("Mensalidade paga com sucesso por " + this.getDonoConta());
            } else {
                System.out.println("Impossivel pagar uma conta inativa ou inexistente");
            }
        } else switch (this.getTipoConta()) {
            case "cc":
                valor = 12.00f;
                break;
            case "cp":
                valor = 20.00f;
                break;
            default:
                if (this.getStatusConta()) {
                    this.setSaldoConta(this.getSaldoConta() - valor);
                    System.out.println("Mensalidade paga com sucesso por " + this.getDonoConta());
                } else {
                    System.out.println("Impossivel pagar uma conta inativa ou inexistente");
                }
                break;
        }
    }
    
    
//    MÉTODOS ESPECIAIS
//      MÉTODO CONSTRUTOR
    public ContaBanco() {
        this.saldoConta = 0;
        this.statusConta = false;
    }

//    GETs AND SETs
    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    
    
    
    
    
}
