package com.gs.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sv_informacoes")
public class Informacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInformacoes;
    private String observacoes;
    // Construtores, getters e setters
	public Informacao(Integer idInformacoes, String observacoes) {
		this.idInformacoes = idInformacoes;
		this.observacoes = observacoes;
	}
	public Integer getIdInformacoes() {
		return idInformacoes;
	}
	public void setIdInformacoes(Integer idInformacoes) {
		this.idInformacoes = idInformacoes;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
