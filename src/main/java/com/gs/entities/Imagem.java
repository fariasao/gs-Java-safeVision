package com.gs.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_sv_imagens")
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idImagem;

    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Paciente paciente;

    private Date dataArquivo;
    private String caminhoArquivos;
    private String observacoes;
    
    public Imagem() {
		
	}
    
    // Construtores, getters e setters
	public Imagem(Integer idImagem, Paciente paciente, Date dataArquivo, String caminhoArquivos, String observacoes) {
		this.idImagem = idImagem;
		this.paciente = paciente;
		this.dataArquivo = dataArquivo;
		this.caminhoArquivos = caminhoArquivos;
		this.observacoes = observacoes;
	}

	public Integer getIdImagem() {
		return idImagem;
	}

	public void setIdImagem(Integer idImagem) {
		this.idImagem = idImagem;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Date getDataArquivo() {
		return dataArquivo;
	}

	public void setDataArquivo(Date dataArquivo) {
		this.dataArquivo = dataArquivo;
	}

	public String getCaminhoArquivos() {
		return caminhoArquivos;
	}

	public void setCaminhoArquivos(String caminhoArquivos) {
		this.caminhoArquivos = caminhoArquivos;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}


    
}
