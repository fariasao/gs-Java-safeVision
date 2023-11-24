package com.gs.entities;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sv_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;

    @ManyToOne
    @JoinColumn(name = "idDependente")
    private Dependente dependente;

    private String nomePaciente;
    private String emailPaciente;
    private String senhaPaciente;
    private Long telefonePaciente;
    private Date dataNascimento;
    
    public Paciente() {
		
	}
    
    // Construtores, getters e setters
	public Paciente(Integer idPaciente, Dependente dependente, String nomePaciente, String emailPaciente, String senhaPaciente,
			Long telefonePaciente, Date dataNascimento) {
		this.idPaciente = idPaciente;
		this.dependente = dependente;
		this.nomePaciente = nomePaciente;
		this.emailPaciente = emailPaciente;
		this.senhaPaciente = senhaPaciente;
		this.telefonePaciente = telefonePaciente;
		this.dataNascimento = dataNascimento;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Dependente getDependente() {
		return dependente;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getEmailPaciente() {
		return emailPaciente;
	}

	public void setEmailPaciente(String emailPaciente) {
		this.emailPaciente = emailPaciente;
	}

	public String getSenhaPaciente() {
		return senhaPaciente;
	}

	public void setSenhaPaciente(String senhaPaciente) {
		this.senhaPaciente = senhaPaciente;
	}

	public Long getTelefonePaciente() {
		return telefonePaciente;
	}

	public void setTelefonePaciente(Long telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	

    
}
