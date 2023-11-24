package com.gs.services;

import com.gs.entities.Paciente;
import com.gs.repositories.PacienteRepository;
import com.gs.bo.PacienteBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;
    private final PacienteBO pacienteBO;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository, PacienteBO pacienteBO) {
        this.pacienteRepository = pacienteRepository;
        this.pacienteBO = pacienteBO;
    }

    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> findPacienteById(Integer id) {
        return pacienteRepository.findById(id);
    }

    public Paciente savePaciente(Paciente paciente) throws Exception {
        // Utilizar PacienteBO para lógica de negócios e validações
        return pacienteBO.savePaciente(paciente);
    }

    public Paciente updatePaciente(Integer id, Paciente pacienteDetails) throws Exception {
        // Utilizar PacienteBO para lógica de negócios e atualização
        return pacienteBO.updatePaciente(id, pacienteDetails);
    }

    public void deletePaciente(Integer id) {
        pacienteRepository.deleteById(id);
    }
}
