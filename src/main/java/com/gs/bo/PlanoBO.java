package com.gs.bo;

import com.gs.entities.Plano;
import com.gs.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlanoBO {

    private final PlanoRepository planoRepository;

    @Autowired
    public PlanoBO(PlanoRepository planoRepository) {
        this.planoRepository = planoRepository;
    }

    public Plano cadastrarPlano(Plano plano) throws Exception {
        validarPlano(plano);
        return planoRepository.save(plano);
    }

    public Plano atualizarPlano(Integer id, Plano detalhesPlano) throws Exception {
        Plano plano = planoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Plano não encontrado"));

        atualizarDadosPlano(plano, detalhesPlano);
        return planoRepository.save(plano);
    }

    private void validarPlano(Plano plano) throws Exception {
        if (plano.getPlanoConvenio() == null || plano.getConvenio() == null) {
            throw new Exception("Dados do plano são inválidos");
        }
    }

    private void atualizarDadosPlano(Plano plano, Plano detalhes) {
        plano.setConvenio(detalhes.getConvenio());
        plano.setPlanoConvenio(detalhes.getPlanoConvenio());
    }
}
