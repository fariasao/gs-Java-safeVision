package com.gs.services;

import com.gs.bo.PlanoBO;
import com.gs.entities.Plano;
import com.gs.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoService {

	private final PlanoRepository planoRepository;
    private final PlanoBO planoBO;

    @Autowired
    public PlanoService(PlanoRepository planoRepository, PlanoBO planoBO) {
        this.planoRepository = planoRepository;
        this.planoBO = planoBO;
    }

    public List<Plano> getAllPlanos() {
        return planoRepository.findAll();
    }

    public Optional<Plano> findPlanoById(Integer id) {
        return planoRepository.findById(id);
    }

    public Plano savePlano(Plano plano) throws Exception {
        return planoBO.cadastrarPlano(plano);
    }

    public Plano updatePlano(Integer id, Plano planoDetails) throws Exception {
        return planoBO.atualizarPlano(id, planoDetails);
    }

    public void deletePlano(Integer id) {
        planoRepository.deleteById(id);
    }
}
