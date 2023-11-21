package com.gs.services;

import com.gs.entities.Medico;
import com.gs.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;

    @Autowired
    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }

    public Optional<Medico> findMedicoById(Long id) {
        return medicoRepository.findById(id);
    }

    public Medico saveMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    public Medico updateMedico(Long id, Medico medicoDetails) {
        Medico medico = medicoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Medico não encontrado"));

        medico.setNome_medico(medicoDetails.getNome_medico());
        medico.setTelefone_medico(medicoDetails.getTelefone_medico());
        medico.setCrm_medico(medicoDetails.getCrm_medico());

        return medicoRepository.save(medico);
    }

    public void deleteMedico(Long id) {
        medicoRepository.deleteById(id);
    }
}
