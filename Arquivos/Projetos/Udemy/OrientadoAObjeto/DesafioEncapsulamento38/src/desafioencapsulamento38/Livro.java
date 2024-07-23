/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioencapsulamento38;

/**
 *
 * @author matheus
 */
public final class Livro implements Publicacao {
//    ATRIBUTOS
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;
    
//    METODOS
//      Construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
        this.paginaAtual = 0;
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
//    Personalizado
    public String detalhes() {
        return "--- LIVRO " + this.getTitulo() + 
                " ---\n\ndo autor: " + this.getAutor() + 
                "\ncom o total de " + this.getTotalPaginas() + " páginas"+
                "\npagina atual: " + this.getPaginaAtual() + 
                "\nestá aberto? " + this.aberto + 
                "\nestá em posse de " + leitor.getNome() + 
                "\nidade: " + leitor.getIdade() +
                "\nNacimento: " + leitor.getDataNacimento();        

    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.totalPaginas) {
            this.paginaAtual = 0;
        } else {
            this.paginaAtual = p;
        }
    }

    @Override
    public void avancarPagina() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() +1 );
            System.out.println("Avançamos para a pagina " + this.getPaginaAtual());
        } else {
            System.out.println("O livro está fechado, e não pode ser folheado.");
        }
    }

    @Override
    public void voltarPagina() {
        if (this.isAberto()) {
            this.setPaginaAtual(this.getPaginaAtual() -1 );
            System.out.println("Voltamos para a pagina " + this.getPaginaAtual());
        } else {
            System.out.println("O livro está fechado, e não pode ser folheado.");
        }
    }
    
    
}
