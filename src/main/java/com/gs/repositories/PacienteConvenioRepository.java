package com.gs.repositories;

import com.gs.entities.PacienteConvenio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PacienteConvenioRepository extends JpaRepository<PacienteConvenio, Integer> {
    List<PacienteConvenio> findByidPaciente(Integer idPaciente);
    List<PacienteConvenio> findByidPlano(Integer idPlano);
    void deleteByIdPacienteAndIdPlano(Integer idPaciente, Integer idPlano);
}
