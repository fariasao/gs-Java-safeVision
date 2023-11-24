package com.gs.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sv_plano")
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlano;

    @ManyToOne
    @JoinColumn(name = "idConvenio")
    private Convenio convenio;

    private String planoConvenio;
    
    public Plano() {
		
	}

    // Construtores, getters e setters
	public Plano(Integer idPlano, Convenio convenio, String planoConvenio) {
		this.idPlano = idPlano;
		this.convenio = convenio;
		this.planoConvenio = planoConvenio;
	}

	public Integer getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(Integer idPlano) {
		this.idPlano = idPlano;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public String getPlanoConvenio() {
		return planoConvenio;
	}

	public void setPlanoConvenio(String planoConvenio) {
		this.planoConvenio = planoConvenio;
	}

    
}
