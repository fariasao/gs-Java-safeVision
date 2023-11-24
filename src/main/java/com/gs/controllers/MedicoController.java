package com.gs.controllers;

import com.gs.entities.Medico;
import com.gs.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private final MedicoService medicoService;

    @Autowired
    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping
    public List<Medico> getAllMedicos() {
        return medicoService.getAllMedicos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> getMedicoById(@PathVariable Long id) {
        Medico medico = medicoService.findMedicoById(id)
            .orElseThrow(() -> new RuntimeException("Medico não encontrado"));
        return ResponseEntity.ok(medico);
    }

    @PostMapping
    public ResponseEntity<?> createMedico(@RequestBody Medico medico) {
        try {
            Medico novoMedico = medicoService.saveMedico(medico);
            return ResponseEntity.ok(novoMedico);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao criar o médico: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateMedico(@PathVariable Long id, @RequestBody Medico medico) {
        try {
            Medico medicoAtualizado = medicoService.updateMedico(id, medico);
            return ResponseEntity.ok(medicoAtualizado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao atualizar o médico: " + e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedico(@PathVariable Long id) {
        medicoService.deleteMedico(id);
        return ResponseEntity.noContent().build();
    }
}
