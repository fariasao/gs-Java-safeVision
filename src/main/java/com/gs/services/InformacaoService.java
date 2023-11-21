package com.gs.services;

import com.gs.entities.Informacao;
import com.gs.repositories.InformacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformacaoService {

    private final InformacaoRepository informacaoRepository;

    @Autowired
    public InformacaoService(InformacaoRepository informacaoRepository) {
        this.informacaoRepository = informacaoRepository;
    }

    public List<Informacao> getAllInformacoes() {
        return informacaoRepository.findAll();
    }

    public Optional<Informacao> findInformacaoById(Integer id) {
        return informacaoRepository.findById(id);
    }

    public Informacao saveInformacao(Informacao informacao) {
        return informacaoRepository.save(informacao);
    }

    public Informacao updateInformacao(Integer id, Informacao informacaoDetails) {
        Informacao informacao = informacaoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Informação não encontrada"));

        informacao.setObservacoes(informacaoDetails.getObservacoes());

        return informacaoRepository.save(informacao);
    }

    public void deleteInformacao(Integer id) {
        informacaoRepository.deleteById(id);
    }
}
