package com.algaworks.sistemaautenticacao.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "configuracao")
public class Configuracao {

	@Id
	private Integer id;
	@Column(name= "receber_notificacoes")
	private boolean receberNotificacoes;
	
	@Column(name= "encerrar_sessao_automatica")
	private boolean encerrarSessaoAutomatica;
	
	@MapsId
	@OneToOne
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isReceberNotificacoes() {
		return receberNotificacoes;
	}

	public void setReceberNotificacoes(boolean receberNotificacoes) {
		this.receberNotificacoes = receberNotificacoes;
	}

	public boolean isEncerrarSessaoAutomatica() {
		return encerrarSessaoAutomatica;
	}

	public void setEncerrarSessaoAutomatica(boolean encerrarSessaoAutomatica) {
		this.encerrarSessaoAutomatica = encerrarSessaoAutomatica;
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
		Configuracao other = (Configuracao) obj;
		return Objects.equals(id, other.id);
	}
	
		
	
	
}
