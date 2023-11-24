package com.gs.bo;

import com.gs.entities.Convenio;
import com.gs.repositories.ConvenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConvenioBO {

    private final ConvenioRepository convenioRepository;

    @Autowired
    public ConvenioBO(ConvenioRepository convenioRepository) {
        this.convenioRepository = convenioRepository;
    }

    public Convenio cadastrarConvenio(Convenio convenio) throws Exception {
        validarConvenio(convenio);
        return convenioRepository.save(convenio);
    }

    public Convenio atualizarConvenio(Integer id, Convenio detalhesConvenio) throws Exception {
        Convenio convenio = convenioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Convenio não encontrado"));

        atualizarDadosConvenio(convenio, detalhesConvenio);
        return convenioRepository.save(convenio);
    }

    private void validarConvenio(Convenio convenio) throws Exception {
        if (convenio.getNomeConvenio() == null || convenio.getTelefoneConvenio() == null) {
            throw new Exception("Dados do convênio são inválidos");
        }
    }

    private void atualizarDadosConvenio(Convenio convenio, Convenio detalhes) {
        convenio.setNomeConvenio(detalhes.getNomeConvenio());
        convenio.setTelefoneConvenio(detalhes.getTelefoneConvenio());
    }
}
