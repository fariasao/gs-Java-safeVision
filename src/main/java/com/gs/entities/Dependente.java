package com.gs.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sv_dependente")
public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDependente;
    private String nomeDependente;
    private Long rgDependente;
    private Date dataNascimento;
    private String sexoDependente;
    
    public Dependente() {
		
	}

    // Construtores, getters e setters
	public Dependente(Integer idDependente, String nomeDependente, Long rgDependente, Date dataNascimento,
			String sexoDependente) {
		this.idDependente = idDependente;
		this.nomeDependente = nomeDependente;
		this.rgDependente = rgDependente;
		this.dataNascimento = dataNascimento;
		this.sexoDependente = sexoDependente;
	}

	public Integer getIdDependente() {
		return idDependente;
	}

	public void setIdDependente(Integer idDependente) {
		this.idDependente = idDependente;
	}

	public String getNomeDependente() {
		return nomeDependente;
	}

	public void setNomeDependente(String nomeDependente) {
		this.nomeDependente = nomeDependente;
	}

	public Long getRgDependente() {
		return rgDependente;
	}

	public void setRgDependente(Long rgDependente) {
		this.rgDependente = rgDependente;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexoDependente() {
		return sexoDependente;
	}

	public void setSexoDependente(String sexoDependente) {
		this.sexoDependente = sexoDependente;
	}
	
    
	
}
