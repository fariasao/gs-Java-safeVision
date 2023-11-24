package com.gs.services;

import com.gs.bo.ConvenioBO;
import com.gs.entities.Convenio;
import com.gs.repositories.ConvenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConvenioService {

	private final ConvenioRepository convenioRepository;
    private final ConvenioBO convenioBO;

    @Autowired
    public ConvenioService(ConvenioRepository convenioRepository, ConvenioBO convenioBO) {
        this.convenioRepository = convenioRepository;
        this.convenioBO = convenioBO;
    }

    public List<Convenio> getAllConvenios() {
        return convenioRepository.findAll();
    }

    public Optional<Convenio> findConvenioById(Integer id) {
        return convenioRepository.findById(id);
    }

    public Convenio saveConvenio(Convenio convenio) throws Exception {
        return convenioBO.cadastrarConvenio(convenio);
    }

    public Convenio updateConvenio(Integer id, Convenio convenioDetails) throws Exception {
        return convenioBO.atualizarConvenio(id, convenioDetails);
    }

    public void deleteConvenio(Integer id) {
        convenioRepository.deleteById(id);
    }
}
