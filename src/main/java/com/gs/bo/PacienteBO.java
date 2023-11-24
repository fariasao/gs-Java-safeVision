package com.gs.bo;

import com.gs.entities.Paciente;
import com.gs.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PacienteBO {

    private final PacienteRepository pacienteRepository;

    @Autowired
    public PacienteBO(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente savePaciente(Paciente paciente) throws Exception {
        validarPaciente(paciente);

        // Salvar no banco de dados
        return pacienteRepository.save(paciente);
    }

    public Paciente updatePaciente(Integer id, Paciente pacienteDetails) throws Exception {
        Paciente paciente = pacienteRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
        atualizarDadosPaciente(paciente, pacienteDetails);

        return pacienteRepository.save(paciente);
    }

    private void validarPaciente(Paciente paciente) throws Exception {
        if (paciente.getNomePaciente() == null || paciente.getEmailPaciente() == null) {
            throw new Exception("Dados do paciente são inválidos");
        }
    }

    private void atualizarDadosPaciente(Paciente paciente, Paciente detalhes) {
        // Atualizar os dados do paciente com os detalhes fornecidos
        paciente.setNomePaciente(detalhes.getNomePaciente());
        paciente.setEmailPaciente(detalhes.getEmailPaciente());
        paciente.setSenhaPaciente(detalhes.getSenhaPaciente());
        paciente.setTelefonePaciente(detalhes.getTelefonePaciente());
        paciente.setDataNascimento(detalhes.getDataNascimento());
        paciente.setDependente(detalhes.getDependente());
    }
}
