package com.gs.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sv_medicos")
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMedico;
	private String nome_medico;
	private Long telefone_medico;
	private String crm_medico;
	
	public Medico () {
		
	}

	public Medico(Long idMedico, String nome_medico, Long telefone_medico, String crm_medico) {
		this.idMedico = idMedico;
		this.nome_medico = nome_medico;
		this.telefone_medico = telefone_medico;
		this.crm_medico = crm_medico;
	}

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}

	public String getNome_medico() {
		return nome_medico;
	}

	public void setNome_medico(String nome_medico) {
		this.nome_medico = nome_medico;
	}

	public Long getTelefone_medico() {
		return telefone_medico;
	}

	public void setTelefone_medico(Long telefone_medico) {
		this.telefone_medico = telefone_medico;
	}

	public String getCrm_medico() {
		return crm_medico;
	}

	public void setCrm_medico(String crm_medico) {
		this.crm_medico = crm_medico;
	}
	
	
}
