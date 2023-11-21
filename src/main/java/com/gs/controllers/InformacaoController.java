package com.gs.controllers;

import com.gs.entities.Informacao;
import com.gs.services.InformacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/informacoes")
public class InformacaoController {

    private final InformacaoService informacaoService;

    @Autowired
    public InformacaoController(InformacaoService informacaoService) {
        this.informacaoService = informacaoService;
    }

    @GetMapping
    public List<Informacao> getAllInformacoes() {
        return informacaoService.getAllInformacoes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Informacao> getInformacaoById(@PathVariable Integer id) {
        Informacao informacao = informacaoService.findInformacaoById(id)
            .orElseThrow(() -> new RuntimeException("Informação não encontrada"));
        return ResponseEntity.ok(informacao);
    }

    @PostMapping
    public ResponseEntity<Informacao> createInformacao(@RequestBody Informacao informacao) {
        Informacao novaInformacao = informacaoService.saveInformacao(informacao);
        return ResponseEntity.ok(novaInformacao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Informacao> updateInformacao(@PathVariable Integer id, @RequestBody Informacao informacao) {
        Informacao informacaoAtualizada = informacaoService.updateInformacao(id, informacao);
        return ResponseEntity.ok(informacaoAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInformacao(@PathVariable Integer id) {
        informacaoService.deleteInformacao(id);
        return ResponseEntity.noContent().build();
    }
}
