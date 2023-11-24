package com.gs.bo;

import com.gs.entities.Medico;
import com.gs.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MedicoBO {

    private final MedicoRepository medicoRepository;

    @Autowired
    public MedicoBO(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public Medico cadastrarMedico(Medico medico) throws Exception {
        validarMedico(medico);
        return medicoRepository.save(medico);
    }

    public Medico atualizarMedico(Long id, Medico detalhesMedico) throws Exception {
        Medico medico = medicoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Medico não encontrado"));

        atualizarDadosMedico(medico, detalhesMedico);
        return medicoRepository.save(medico);
    }

    private void validarMedico(Medico medico) throws Exception {
        if (medico.getNome_medico() == null || medico.getCrm_medico() == null) {
            throw new Exception("Dados do médico são inválidos");
        }
    }

    private void atualizarDadosMedico(Medico medico, Medico detalhes) {
        medico.setNome_medico(detalhes.getNome_medico());
        medico.setTelefone_medico(detalhes.getTelefone_medico());
        medico.setCrm_medico(detalhes.getCrm_medico());
    }
}
