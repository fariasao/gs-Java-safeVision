package com.gs.controllers;

import com.gs.entities.Paciente;
import com.gs.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public List<Paciente> getAllPacientes() {
        return pacienteService.getAllPacientes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> getUsuarioById(@PathVariable Integer id) {
    	Paciente paciente = pacienteService.findPacienteById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return ResponseEntity.ok(paciente);
    }

    @PostMapping
    public ResponseEntity<?> createUsuario(@RequestBody Paciente paciente) {
        try {
            Paciente novoPaciente = pacienteService.savePaciente(paciente);
            return ResponseEntity.ok(novoPaciente);
        } catch (Exception e) {
            // Aqui você pode logar a exceção e/ou formatar uma mensagem de erro
            return ResponseEntity.badRequest().body("Erro ao criar o paciente: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUsuario(@PathVariable Integer id, @RequestBody Paciente paciente) {
        try {
            Paciente pacienteAtualizado = pacienteService.updatePaciente(id, paciente);
            return ResponseEntity.ok(pacienteAtualizado);
        } catch (Exception e) {
            // Aqui você também pode logar a exceção e/ou formatar uma mensagem de erro
            return ResponseEntity.badRequest().body("Erro ao atualizar o paciente: " + e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Integer id) {
    	pacienteService.deletePaciente(id);
        return ResponseEntity.noContent().build();
    }
}
