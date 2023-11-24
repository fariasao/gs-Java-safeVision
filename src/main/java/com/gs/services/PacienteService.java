package com.gs.services;

import com.gs.entities.Paciente;
import com.gs.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> findPacienteById(Integer id) {
        return pacienteRepository.findById(id);
    }

    public Paciente savePaciente(Paciente usuario) {
        // Aqui podem ser adicionadas validações ou lógica de negócios
        return pacienteRepository.save(usuario);
    }

    public Paciente updatePaciente(Integer id, Paciente pacienteDetails) {
    	Paciente paciente = pacienteRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

    	paciente.setNomePaciente(pacienteDetails.getNomePaciente());
    	paciente.setEmailPaciente(pacienteDetails.getEmailPaciente());
    	paciente.setSenhaPaciente(pacienteDetails.getSenhaPaciente());
    	paciente.setTelefonePaciente(pacienteDetails.getTelefonePaciente());
        paciente.setDataNascimento(pacienteDetails.getDataNascimento());
        paciente.setDependente(pacienteDetails.getDependente());

        return pacienteRepository.save(paciente);
    }

    public void deletePaciente(Integer id) {
    	pacienteRepository.deleteById(id);
    }
}
