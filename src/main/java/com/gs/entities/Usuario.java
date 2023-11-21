package com.gs.entities;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sv_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Paciente paciente;

    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private Long telefoneUsuario;
    private Date dataNascimento;
    
    // Construtores, getters e setters
	public Usuario(Integer idUsuario, Paciente paciente, String nomeUsuario, String emailUsuario, String senhaUsuario,
			Long telefoneUsuario, Date dataNascimento) {
		this.idUsuario = idUsuario;
		this.paciente = paciente;
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.telefoneUsuario = telefoneUsuario;
		this.dataNascimento = dataNascimento;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public Long getTelefoneUsuario() {
		return telefoneUsuario;
	}

	public void setTelefoneUsuario(Long telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

    
}
