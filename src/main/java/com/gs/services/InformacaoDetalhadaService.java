package com.gs.services;

import com.gs.entities.InformacaoDetalhada;
import com.gs.repositories.InformacaoDetalhadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformacaoDetalhadaService {

    private final InformacaoDetalhadaRepository informacaoDetalhadaRepository;

    @Autowired
    public InformacaoDetalhadaService(InformacaoDetalhadaRepository informacaoDetalhadaRepository) {
        this.informacaoDetalhadaRepository = informacaoDetalhadaRepository;
    }

    public List<InformacaoDetalhada> getAllInformacoesDetalhadas() {
        return informacaoDetalhadaRepository.findAll();
    }

    public Optional<InformacaoDetalhada> findInformacaoDetalhadaById(Integer id) {
        return informacaoDetalhadaRepository.findById(id);
    }

    public InformacaoDetalhada saveInformacaoDetalhada(InformacaoDetalhada informacaoDetalhada) {
        return informacaoDetalhadaRepository.save(informacaoDetalhada);
    }

    public InformacaoDetalhada updateInformacaoDetalhada(Integer id, InformacaoDetalhada informacaoDetalhadaDetails) {
        InformacaoDetalhada informacaoDetalhada = informacaoDetalhadaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Informação Detalhada não encontrada"));

        informacaoDetalhada.setObservacoes(informacaoDetalhadaDetails.getObservacoes());
        // Atualizar outros campos conforme necessário

        return informacaoDetalhadaRepository.save(informacaoDetalhada);
    }

    public void deleteInformacaoDetalhada(Integer id) {
        informacaoDetalhadaRepository.deleteById(id);
    }
}
