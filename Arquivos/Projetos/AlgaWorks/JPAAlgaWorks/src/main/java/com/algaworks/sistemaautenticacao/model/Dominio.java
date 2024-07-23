package com.algaworks.sistemaautenticacao.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "dominio")
public class Dominio {

	@Id
	private Integer id;
	
	@OneToMany(mappedBy = "dominio")
	private List<Usuario> usuarios;

	private String nome;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
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
			Dominio other = (Dominio) obj;
			return Objects.equals(id, other.id);
		}
	
	
	
	
	
}

