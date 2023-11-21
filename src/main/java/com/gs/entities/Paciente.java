package com.gs.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sv_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;
    private String nomePaciente;
    private Long rgPaciente;
    private Date dataNascimento;
    private String sexoPaciente;
    // Construtores, getters e setters
	public Paciente(Integer idPaciente, String nomePaciente, Long rgPaciente, Date dataNascimento,
			String sexoPaciente) {
		this.idPaciente = idPaciente;
		this.nomePaciente = nomePaciente;
		this.rgPaciente = rgPaciente;
		this.dataNascimento = dataNascimento;
		this.sexoPaciente = sexoPaciente;
	}
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public Long getRgPaciente() {
		return rgPaciente;
	}
	public void setRgPaciente(Long rgPaciente) {
		this.rgPaciente = rgPaciente;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexoPaciente() {
		return sexoPaciente;
	}
	public void setSexoPaciente(String sexoPaciente) {
		this.sexoPaciente = sexoPaciente;
	}
    
	
}
