package com.gs.controllers;

import com.gs.entities.InformacaoDetalhada;
import com.gs.services.InformacaoDetalhadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/informacoes")
public class InformacaoDetalhadaController {

    private final InformacaoDetalhadaService informacaoDetalhadaService;

    @Autowired
    public InformacaoDetalhadaController(InformacaoDetalhadaService informacaoDetalhadaService) {
        this.informacaoDetalhadaService = informacaoDetalhadaService;
    }

    @GetMapping
    public List<InformacaoDetalhada> getAllInformacoesDetalhadas() {
        return informacaoDetalhadaService.getAllInformacoesDetalhadas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InformacaoDetalhada> getInformacaoDetalhadaById(@PathVariable Integer id) {
        InformacaoDetalhada informacaoDetalhada = informacaoDetalhadaService.findInformacaoDetalhadaById(id)
            .orElseThrow(() -> new RuntimeException("Informação Detalhada não encontrada"));
        return ResponseEntity.ok(informacaoDetalhada);
    }

    @PostMapping
    public ResponseEntity<InformacaoDetalhada> createInformacaoDetalhada(@RequestBody InformacaoDetalhada informacaoDetalhada) {
        InformacaoDetalhada novaInformacaoDetalhada = informacaoDetalhadaService.saveInformacaoDetalhada(informacaoDetalhada);
        return ResponseEntity.ok(novaInformacaoDetalhada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InformacaoDetalhada> updateInformacaoDetalhada(@PathVariable Integer id, @RequestBody InformacaoDetalhada informacaoDetalhada) {
        InformacaoDetalhada informacaoDetalhadaAtualizada = informacaoDetalhadaService.updateInformacaoDetalhada(id, informacaoDetalhada);
        return ResponseEntity.ok(informacaoDetalhadaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInformacaoDetalhada(@PathVariable Integer id) {
        informacaoDetalhadaService.deleteInformacaoDetalhada(id);
        return ResponseEntity.noContent().build();
    }
}
