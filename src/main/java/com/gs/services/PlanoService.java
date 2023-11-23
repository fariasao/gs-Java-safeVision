package com.gs.services;

import com.gs.entities.Plano;
import com.gs.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoService {

    private final PlanoRepository planoRepository;

    @Autowired
    public PlanoService(PlanoRepository planoRepository) {
        this.planoRepository = planoRepository;
    }

    public List<Plano> getAllPlanos() {
        return planoRepository.findAll();
    }

    public Optional<Plano> findPlanoById(Integer id) {
        return planoRepository.findById(id);
    }

    public Plano savePlano(Plano plano) {
        return planoRepository.save(plano);
    }

    public Plano updatePlano(Integer id, Plano planoDetails) {
        Plano plano = planoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Plano não encontrado"));

        plano.setConvenio(planoDetails.getConvenio());
        plano.setPlanoConvenio(planoDetails.getPlanoConvenio());

        return planoRepository.save(plano);
    }

    public void deletePlano(Integer id) {
        planoRepository.deleteById(id);
    }
}
