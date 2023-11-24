package com.gs.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_sv_resultados")
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idResultado;

    @ManyToOne
    @JoinColumn(name = "idImagem")
    private Imagem imagem;

    private Date dataAnalise;
    private String diagnostico;
    private Float probabilidade;
    private String comentarios;
    
    public Resultado() {
		
	}
    
    // Construtores, getters e setters
	public Resultado(Integer idResultado, Imagem imagem, Date dataAnalise, String diagnostico,
			Float probabilidade, String comentarios) {
		this.idResultado = idResultado;
		this.imagem = imagem;
		this.dataAnalise = dataAnalise;
		this.diagnostico = diagnostico;
		this.probabilidade = probabilidade;
		this.comentarios = comentarios;
	}

	public Integer getIdResultado() {
		return idResultado;
	}

	public void setIdResultado(Integer idResultado) {
		this.idResultado = idResultado;
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

	public Date getDataAnalise() {
		return dataAnalise;
	}

	public void setDataAnalise(Date dataAnalise) {
		this.dataAnalise = dataAnalise;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Float getProbabilidade() {
		return probabilidade;
	}

	public void setProbabilidade(Float probabilidade) {
		this.probabilidade = probabilidade;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

    
}