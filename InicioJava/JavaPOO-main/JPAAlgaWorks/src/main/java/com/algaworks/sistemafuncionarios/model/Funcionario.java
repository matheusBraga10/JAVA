package com.algaworks.sistemafuncionarios.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name= "funcionario")
public class Funcionario {
	
	@Id
	private Integer id;
	
	@Version // Salva versões dos registros
	private Integer versao;
	
	private String nome;
	
	private Integer bancoDeHoras;
	
	private BigDecimal salario;
	
	private BigDecimal valorHoraExtra;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getBancoDeHoras() {
		return bancoDeHoras;
	}

	public void setBancoDeHoras(Integer bancoDeHoras) {
		this.bancoDeHoras = bancoDeHoras;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public BigDecimal getValorHoraExtra() {
		return valorHoraExtra;
	}

	public void setValorHoraExtra(BigDecimal valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
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
		Funcionario other = (Funcionario) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
