package com.gs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gs.entities.Dependente;
import com.gs.repositories.DependenteRepository;

@Service
public class DependenteService {

    private final DependenteRepository dependenteRepository;

    @Autowired
    public DependenteService(DependenteRepository dependenteRepository) {
        this.dependenteRepository = dependenteRepository;
    }

    public List<Dependente> getAllDependentes() {
        return dependenteRepository.findAll();
    }

    public Optional<Dependente> findDependenteById(Integer id) {
        return dependenteRepository.findById(id);
    }

    public Dependente saveDependente(Dependente dependente) {
        return dependenteRepository.save(dependente);
    }

    public Dependente updateDependentes(Integer id, Dependente dependentesDetails) {
    	Dependente dependente = dependenteRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));

    	dependente.setNomeDependente(dependentesDetails.getNomeDependente());
    	dependente.setRgDependente(dependentesDetails.getRgDependente());
    	dependente.setDataNascimento(dependentesDetails.getDataNascimento());
    	dependente.setSexoDependente(dependentesDetails.getSexoDependente());

        return dependenteRepository.save(dependente);
    }

    public void deleteDependente(Integer id) {
    	dependenteRepository.deleteById(id);
    }
}
