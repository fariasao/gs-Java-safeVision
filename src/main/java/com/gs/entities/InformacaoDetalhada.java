package com.gs.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sv_informacoes")
@IdClass(InformacaoId.class)
public class InformacaoDetalhada {

    @Id
    private Integer idResultado;

    @Id
    private Integer idMedicoHospital;

    @ManyToOne
    @JoinColumn(name = "idResultado", referencedColumnName = "idResultado", insertable = false, updatable = false)
    private Resultado resultado;

    @ManyToOne
    @JoinColumn(name = "idMedicoHospital", referencedColumnName = "idMedicoHospital", insertable = false, updatable = false)
    private InfoMedicoHospital infoMedicoHospital;

    private String observacoes;

    public InformacaoDetalhada() {
    }

	public InformacaoDetalhada(Integer idResultado, Integer idMedicoHospital, Resultado resultado,
			InfoMedicoHospital infoMedicoHospital, String observacoes) {
		this.idResultado = idResultado;
		this.idMedicoHospital = idMedicoHospital;
		this.resultado = resultado;
		this.infoMedicoHospital = infoMedicoHospital;
		this.observacoes = observacoes;
	}

	public Integer getIdResultado() {
		return idResultado;
	}

	public void setIdResultado(Integer idResultado) {
		this.idResultado = idResultado;
	}

	public Integer getIdMedicoHospital() {
		return idMedicoHospital;
	}

	public void setIdMedicoHospital(Integer idMedicoHospital) {
		this.idMedicoHospital = idMedicoHospital;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public InfoMedicoHospital getInfoMedicoHospital() {
		return infoMedicoHospital;
	}

	public void setInfoMedicoHospital(InfoMedicoHospital infoMedicoHospital) {
		this.infoMedicoHospital = infoMedicoHospital;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

    // Getters e setters
	
}
