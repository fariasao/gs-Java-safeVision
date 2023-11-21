package com.gs.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sv_convenio")
public class Convenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConvenio;
    private String nomeConvenio;
    private Long telefoneConvenio;
    // Construtores, getters e setters
	public Convenio(Integer idConvenio, String nomeConvenio, Long telefoneConvenio) {
		this.idConvenio = idConvenio;
		this.nomeConvenio = nomeConvenio;
		this.telefoneConvenio = telefoneConvenio;
	}
	public Integer getIdConvenio() {
		return idConvenio;
	}
	public void setIdConvenio(Integer idConvenio) {
		this.idConvenio = idConvenio;
	}
	public String getNomeConvenio() {
		return nomeConvenio;
	}
	public void setNomeConvenio(String nomeConvenio) {
		this.nomeConvenio = nomeConvenio;
	}
	public Long getTelefoneConvenio() {
		return telefoneConvenio;
	}
	public void setTelefoneConvenio(Long telefoneConvenio) {
		this.telefoneConvenio = telefoneConvenio;
	}

	
}

