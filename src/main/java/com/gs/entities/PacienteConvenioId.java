package com.gs.entities;

import java.io.Serializable;
import java.util.Objects;

public class PacienteConvenioId implements Serializable {
    private Integer idPaciente;
    private Integer idPlano;

    // Construtores, getters, setters, hashCode e equals
    public PacienteConvenioId() {
    }

    public PacienteConvenioId(Integer idPaciente, Integer idPlano) {
        this.idPaciente = idPaciente;
        this.idPlano = idPlano;
    }

    // Getters e setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacienteConvenioId that = (PacienteConvenioId) o;
        return Objects.equals(idPaciente, that.idPaciente) &&
               Objects.equals(idPlano, that.idPlano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPaciente, idPlano);
    }
}
