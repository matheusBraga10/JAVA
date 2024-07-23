package com.algaworks.sistemausuarios.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuario",
        indexes = { @Index(name = "id_nome", columnList = "nome") }, // define nome das colunas
        uniqueConstraints = { @UniqueConstraint(name = "un_login", columnNames = { "login" })}) // define nome das colunas
public class Usuario {

    @Id
    private Integer id;

    @Column(length = 50, nullable = false) // nullable = false -> NAÕ permite dados nulos
    private String login;

    @Column(length = 100) // Tamanho de caracteres
    private String senha;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(name = "ultimo_acesso")
    private LocalDateTime ultimoAcesso;

    @ManyToOne
    @JoinColumn(name = "dominio_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_usuario_dominio")) // nome das colunas do join
    private Dominio dominio;

    @ManyToMany
    @JoinTable(name = "usuario_grupo", 
            joinColumns = { @JoinColumn(name = "usuario_id",
                    foreignKey = @ForeignKey(name = "fk_usuario_grupo_usuario")) },
            inverseJoinColumns = { @JoinColumn(name = "grupo_id",
                    foreignKey = @ForeignKey(name = "fk_usuario_grupo_grupo")) })
    private List<Grupo> grupos;

    @OneToOne(mappedBy = "usuario")
    private Configuracao configuracao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(LocalDateTime ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dominio getDominio() {
        return dominio;
    }

    public void setDominio(Dominio dominio) {
        this.dominio = dominio;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Configuracao getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(Configuracao configuracao) {
        this.configuracao = configuracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return id.equals(usuario.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}