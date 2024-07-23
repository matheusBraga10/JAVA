/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca39;

/**
 *
 * @author matheus
 */
public class Tecnico extends Aluno{
    private String registroProfissional;
    
    public void praticar() {
        System.out.println("Praticando os conhecimentos adiquiritos");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
