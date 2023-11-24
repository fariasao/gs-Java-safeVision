package com.gs.services;

import com.gs.bo.MedicoBO;
import com.gs.entities.Medico;
import com.gs.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

	private final MedicoRepository medicoRepository;
    private final MedicoBO medicoBO;

    @Autowired
    public MedicoService(MedicoRepository medicoRepository, MedicoBO medicoBO) {
        this.medicoRepository = medicoRepository;
        this.medicoBO = medicoBO;
    }
    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }

    public Optional<Medico> findMedicoById(Long id) {
        return medicoRepository.findById(id);
    }

    public Medico saveMedico(Medico medico) throws Exception {
        return medicoBO.cadastrarMedico(medico);
    }

    public Medico updateMedico(Long id, Medico medicoDetails) throws Exception {
        return medicoBO.atualizarMedico(id, medicoDetails);
    }

    public void deleteMedico(Long id) {
        medicoRepository.deleteById(id);
    }
}
