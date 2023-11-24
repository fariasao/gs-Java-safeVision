package com.gs.entities;

import java.io.Serializable;
import java.util.Objects;

public class InformacaoId implements Serializable {
    private Integer idResultado;
    private Integer idMedicoHospital;

    // Construtores, getters, setters, hashCode e equals
    public InformacaoId() {
    }

    public InformacaoId(Integer idResultado, Integer idMedicoHospital) {
        this.idResultado = idResultado;
        this.idMedicoHospital = idMedicoHospital;
    }

    // Getters e setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InformacaoId)) return false;
        InformacaoId that = (InformacaoId) o;
        return Objects.equals(idResultado, that.idResultado) &&
               Objects.equals(idMedicoHospital, that.idMedicoHospital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResultado, idMedicoHospital);
    }
}
