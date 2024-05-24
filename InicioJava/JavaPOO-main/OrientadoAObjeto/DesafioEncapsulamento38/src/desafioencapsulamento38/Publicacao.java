/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package desafioencapsulamento38;

/**
 *
 * @author matheus
 */
public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int p);
    public abstract void avancarPagina();
    public abstract void voltarPagina();
}
