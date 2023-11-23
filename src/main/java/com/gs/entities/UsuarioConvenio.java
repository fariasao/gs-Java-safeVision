package com.gs.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sv_usuario_convenio")
@IdClass(UsuarioConvenioId.class)
public class UsuarioConvenio {

    @Id
    private Integer idUsuario;

    @Id
    private Integer idPlano;

    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idPlano", referencedColumnName = "idPlano", insertable = false, updatable = false)
    private Plano plano;
    // Construtores, getters e setters

	public UsuarioConvenio(Integer idUsuario, Integer idPlano, Usuario usuario, Plano plano) {
		this.idUsuario = idUsuario;
		this.idPlano = idPlano;
		this.usuario = usuario;
		this.plano = plano;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdPlano() {
		return idPlano;
	}

	public void setIdPlano(Integer idPlano) {
		this.idPlano = idPlano;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

}
