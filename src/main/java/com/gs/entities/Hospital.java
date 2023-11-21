package com.gs.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sv_hospitais")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHospital;
    private String nomeHospital;
    private Long telefoneHospital;
    private String enderecoHospital;
    // Construtores, getters e setters
	public Hospital(Integer idHospital, String nomeHospital, Long telefoneHospital, String enderecoHospital) {
		this.idHospital = idHospital;
		this.nomeHospital = nomeHospital;
		this.telefoneHospital = telefoneHospital;
		this.enderecoHospital = enderecoHospital;
	}
	
	public Integer getIdHospital() {
		return idHospital;
	}
	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}
	public String getNomeHospital() {
		return nomeHospital;
	}
	public void setNomeHospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}
	public Long getTelefoneHospital() {
		return telefoneHospital;
	}
	public void setTelefoneHospital(Long telefoneHospital) {
		this.telefoneHospital = telefoneHospital;
	}
	public String getEnderecoHospital() {
		return enderecoHospital;
	}
	public void setEnderecoHospital(String enderecoHospital) {
		this.enderecoHospital = enderecoHospital;
	}
    
}
