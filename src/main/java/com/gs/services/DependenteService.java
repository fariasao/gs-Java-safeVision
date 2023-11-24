package com.gs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gs.bo.DependenteBO;
import com.gs.entities.Dependente;
import com.gs.repositories.DependenteRepository;

@Service
public class DependenteService {

	private final DependenteRepository dependenteRepository;
    private final DependenteBO dependenteBO;

    @Autowired
    public DependenteService(DependenteRepository dependenteRepository, DependenteBO dependenteBO) {
        this.dependenteRepository = dependenteRepository;
        this.dependenteBO = dependenteBO;
    }

    public List<Dependente> getAllDependentes() {
        return dependenteRepository.findAll();
    }

    public Optional<Dependente> findDependenteById(Integer id) {
        return dependenteRepository.findById(id);
    }

    public Dependente saveDependente(Dependente dependente) throws Exception {
        return dependenteBO.cadastrarDependente(dependente);
    }

    public Dependente updateDependentes(Integer id, Dependente dependentesDetails) throws Exception {
        return dependenteBO.atualizarDependente(id, dependentesDetails);
    }
    public void deleteDependente(Integer id) {
    	dependenteRepository.deleteById(id);
    }
}
