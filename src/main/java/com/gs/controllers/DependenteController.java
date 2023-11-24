package com.gs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gs.entities.Dependente;
import com.gs.entities.Paciente;
import com.gs.services.DependenteService;

@RestController
@RequestMapping("/dependentes")
public class DependenteController {

    private final DependenteService dependenteService;

    @Autowired
    public DependenteController(DependenteService dependenteService) {
        this.dependenteService = dependenteService;
    }

    @GetMapping
    public List<Dependente> getAllDependente() {
        return dependenteService.getAllDependentes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dependente> getDependenteById(@PathVariable Integer id) {
    	Dependente dependente = dependenteService.findDependenteById(id)
            .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
        return ResponseEntity.ok(dependente);
    }

    @PostMapping
    public ResponseEntity<?> createDependente(@RequestBody Dependente dependente) {
        try {
            Dependente novoDependente = dependenteService.saveDependente(dependente);
            return ResponseEntity.ok(novoDependente);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao criar o dependente: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateDependente(@PathVariable Integer id, @RequestBody Dependente dependente) {
        try {
            Dependente dependenteAtualizado = dependenteService.updateDependentes(id, dependente);
            return ResponseEntity.ok(dependenteAtualizado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao atualizar o dependente: " + e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDependente(@PathVariable Integer id) {
    	dependenteService.deleteDependente(id);
        return ResponseEntity.noContent().build();
    }
}
