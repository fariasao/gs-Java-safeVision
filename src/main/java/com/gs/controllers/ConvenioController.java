package com.gs.controllers;

import com.gs.entities.Convenio;
import com.gs.services.ConvenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/convenios")
public class ConvenioController {

    private final ConvenioService convenioService;

    @Autowired
    public ConvenioController(ConvenioService convenioService) {
        this.convenioService = convenioService;
    }

    @GetMapping
    public List<Convenio> getAllConvenios() {
        return convenioService.getAllConvenios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Convenio> getConvenioById(@PathVariable Integer id) {
        Convenio convenio = convenioService.findConvenioById(id)
            .orElseThrow(() -> new RuntimeException("Convenio não encontrado"));
        return ResponseEntity.ok(convenio);
    }

    @PostMapping
    public ResponseEntity<Convenio> createConvenio(@RequestBody Convenio convenio) {
        Convenio novoConvenio = convenioService.saveConvenio(convenio);
        return ResponseEntity.ok(novoConvenio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Convenio> updateConvenio(@PathVariable Integer id, @RequestBody Convenio convenio) {
        Convenio convenioAtualizado = convenioService.updateConvenio(id, convenio);
        return ResponseEntity.ok(convenioAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConvenio(@PathVariable Integer id) {
        convenioService.deleteConvenio(id);
        return ResponseEntity.noContent().build();
    }
}
