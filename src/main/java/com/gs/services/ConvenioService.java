package com.gs.services;

import com.gs.entities.Convenio;
import com.gs.repositories.ConvenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConvenioService {

    private final ConvenioRepository convenioRepository;

    @Autowired
    public ConvenioService(ConvenioRepository convenioRepository) {
        this.convenioRepository = convenioRepository;
    }

    public List<Convenio> getAllConvenios() {
        return convenioRepository.findAll();
    }

    public Optional<Convenio> findConvenioById(Integer id) {
        return convenioRepository.findById(id);
    }

    public Convenio saveConvenio(Convenio convenio) {
        return convenioRepository.save(convenio);
    }

    public Convenio updateConvenio(Integer id, Convenio convenioDetails) {
        Convenio convenio = convenioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Convenio não encontrado"));

        convenio.setNomeConvenio(convenioDetails.getNomeConvenio());
        convenio.setTelefoneConvenio(convenioDetails.getTelefoneConvenio());

        return convenioRepository.save(convenio);
    }

    public void deleteConvenio(Integer id) {
        convenioRepository.deleteById(id);
    }
}
