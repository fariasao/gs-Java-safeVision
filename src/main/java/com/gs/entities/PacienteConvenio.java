package com.gs.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sv_paciente_convenio")
@IdClass(PacienteConvenioId.class)
public class PacienteConvenio {

    @Id
    private Integer idPaciente;

    @Id
    private Integer idPlano;

    @ManyToOne
    @JoinColumn(name = "idPaciente", referencedColumnName = "idPaciente", insertable = false, updatable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "idPlano", referencedColumnName = "idPlano", insertable = false, updatable = false)
    private Plano plano;
    
    public PacienteConvenio() {
		
	}
    // Construtores, getters e setters

	public PacienteConvenio(Integer idPaciente, Integer idPlano, Paciente paciente, Plano plano) {
		this.idPaciente = idPaciente;
		this.idPlano = idPlano;
		this.paciente = paciente;
		this.plano = plano;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Integer getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(Integer idPlano) {
		this.idPlano = idPlano;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	

	

}
