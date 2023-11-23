package com.gs.entities;

import java.io.Serializable;
import java.util.Objects;

public class UsuarioConvenioId implements Serializable {
    private Integer idUsuario;
    private Integer idPlano;

    // Construtores, getters, setters, hashCode e equals
    public UsuarioConvenioId() {
    }

    public UsuarioConvenioId(Integer idUsuario, Integer idPlano) {
        this.idUsuario = idUsuario;
        this.idPlano = idPlano;
    }

    // Getters e setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioConvenioId that = (UsuarioConvenioId) o;
        return Objects.equals(idUsuario, that.idUsuario) &&
               Objects.equals(idPlano, that.idPlano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idPlano);
    }
}
