package com.gs.bo;

import com.gs.entities.Dependente;
import com.gs.repositories.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependenteBO {

    private final DependenteRepository dependenteRepository;

    @Autowired
    public DependenteBO(DependenteRepository dependenteRepository) {
        this.dependenteRepository = dependenteRepository;
    }

    public Dependente cadastrarDependente(Dependente dependente) throws Exception {
        validarDependente(dependente);
        return dependenteRepository.save(dependente);
    }

    public Dependente atualizarDependente(Integer id, Dependente detalhesDependente) throws Exception {
        Dependente dependente = dependenteRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Dependente não encontrado"));

        atualizarDadosDependente(dependente, detalhesDependente);
        return dependenteRepository.save(dependente);
    }

    private void validarDependente(Dependente dependente) throws Exception {
        if (dependente.getNomeDependente() == null || dependente.getRgDependente() == null) {
            throw new Exception("Dados do dependente são inválidos");
        }
    }

    private void atualizarDadosDependente(Dependente dependente, Dependente detalhes) {
        dependente.setNomeDependente(detalhes.getNomeDependente());
        dependente.setRgDependente(detalhes.getRgDependente());
        dependente.setDataNascimento(detalhes.getDataNascimento());
        dependente.setSexoDependente(detalhes.getSexoDependente());
    }
}
