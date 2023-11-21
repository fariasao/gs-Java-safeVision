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
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    private Date dataArquivo;
    private String caminhoArquivos;
    private String observacoes;
    
    // Construtores, getters e setters
	public Imagem(Integer idImagem, Usuario usuario, Date dataArquivo, String caminhoArquivos, String observacoes) {
		this.idImagem = idImagem;
		this.usuario = usuario;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
