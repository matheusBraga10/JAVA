package com.algaworks.sistemausuarios.model;

import java.util.Objects;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.algaworks.sistemausuarios.dto.UsuarioDTO;


@SqlResultSetMappings({
        @SqlResultSetMapping(name = "mapeamento.Usuario",
                entities = @EntityResult(entityClass = Usuario.class,
                        fields = {
                                @FieldResult(name = "id", column = "usu_codigo"),
                                @FieldResult(name = "login", column = "usu_email"),
                                @FieldResult(name = "senha", column = "usu_senha"),
                                @FieldResult(name = "nome", column = "usu_nome")
                        })),
        @SqlResultSetMapping(name = "mapeamento.UsuarioDTO", classes = {
                @ConstructorResult(targetClass = UsuarioDTO.class, columns = {
                        @ColumnResult(name = "usu_codigo", type = Integer.class),
                        @ColumnResult(name = "usu_email", type = String.class),
                        @ColumnResult(name = "usu_nome", type = String.class),
                })
        })
})
@NamedNativeQueries({
        @NamedNativeQuery(name = "namedQuery.Usuario",
                query = "select * from sis_usuario", resultSetMapping = "mapeamento.Usuario"
//                query = "select * from usuario", resultClass = Usuario.class
        )})
@Table(name = "usuario")
@Entity
public class Usuario {


	@Id
    private Integer id;

    private String login;

    private String senha;

    private String nome;

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

	public void setNome(String nome) {
		this.nome = nome;
	}
    
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}
    
}