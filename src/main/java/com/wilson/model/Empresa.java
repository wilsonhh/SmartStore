package com.wilson.model;

import java.sql.Timestamp;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresa")
@ManagedBean(name="empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column
	private String nome;
	
	@Column
	private double cnpj;
	
	@Column(name="inscricao_estadual")
	private String inscricaoEstadual;
	
	@Column(name="data_registro")
    private Timestamp dataRegistro;
	
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCnpj() {
		return cnpj;
	}

	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public Timestamp getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Timestamp dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual
				+ ", dataRegistro=" + dataRegistro + ", status=" + status + "]";
	}

}
