package com.gs.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sv_info_medico_hospital")
public class InfoMedicoHospital {

    @Id
    private Integer idInformacoes;

    @ManyToOne
    @JoinColumn(name = "idMedico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "idHospital")
    private Hospital hospital;
    // Construtores, getters e setters

	public InfoMedicoHospital(Integer idInformacoes, Medico medico, Hospital hospital) {
		this.idInformacoes = idInformacoes;
		this.medico = medico;
		this.hospital = hospital;
	}

	public Integer getIdInformacoes() {
		return idInformacoes;
	}

	public void setIdInformacoes(Integer idInformacoes) {
		this.idInformacoes = idInformacoes;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	
}
