package com.gs.services;

import com.gs.entities.PacienteConvenio;
import com.gs.repositories.PacienteConvenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteConvenioService {

    private final PacienteConvenioRepository pacienteConvenioRepository;

    @Autowired
    public PacienteConvenioService(PacienteConvenioRepository pacienteConvenioRepository) {
        this.pacienteConvenioRepository = pacienteConvenioRepository;
    }

    public List<PacienteConvenio> getAllPacientesConvenios() {
        return pacienteConvenioRepository.findAll();
    }

    public List<PacienteConvenio> findByPacienteId(Integer idPaciente) {
        return pacienteConvenioRepository.findByidPaciente(idPaciente);
    }

    public List<PacienteConvenio> findByPlanoId(Integer idPlano) {
        return pacienteConvenioRepository.findByidPlano(idPlano);
    }

    public PacienteConvenio savePacienteConvenio(PacienteConvenio pacienteConvenio) {
        return pacienteConvenioRepository.save(pacienteConvenio);
    }

    public void deletePacienteConvenio(Integer idUsuario, Integer idPlano) {
    	pacienteConvenioRepository.deleteByIdPacienteAndIdPlano(idUsuario, idPlano);
    }
}
