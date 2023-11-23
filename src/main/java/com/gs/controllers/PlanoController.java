package com.gs.controllers;

import com.gs.entities.Plano;
import com.gs.services.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planos")
public class PlanoController {

    private final PlanoService planoService;

    @Autowired
    public PlanoController(PlanoService planoService) {
        this.planoService = planoService;
    }

    @GetMapping
    public List<Plano> getAllPlanos() {
        return planoService.getAllPlanos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plano> getPlanoById(@PathVariable Integer id) {
        Plano plano = planoService.findPlanoById(id)
            .orElseThrow(() -> new RuntimeException("Plano não encontrado"));
        return ResponseEntity.ok(plano);
    }

    @PostMapping
    public ResponseEntity<Plano> createPlano(@RequestBody Plano plano) {
        Plano novoPlano = planoService.savePlano(plano);
        return ResponseEntity.ok(novoPlano);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plano> updatePlano(@PathVariable Integer id, @RequestBody Plano plano) {
        Plano planoAtualizado = planoService.updatePlano(id, plano);
        return ResponseEntity.ok(planoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlano(@PathVariable Integer id) {
        planoService.deletePlano(id);
        return ResponseEntity.noContent().build();
    }
}
