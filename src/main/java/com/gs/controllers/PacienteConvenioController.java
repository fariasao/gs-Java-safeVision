package com.gs.controllers;

import com.gs.entities.PacienteConvenio;
import com.gs.services.PacienteConvenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes-convenios")
public class PacienteConvenioController {

    private final PacienteConvenioService pacienteConvenioService;

    @Autowired
    public PacienteConvenioController(PacienteConvenioService pacienteConvenioService) {
        this.pacienteConvenioService = pacienteConvenioService;
    }

    @GetMapping
    public List<PacienteConvenio> getAllPacientesConvenios() {
        return pacienteConvenioService.getAllPacientesConvenios();
    }

    @GetMapping("/usuario/{idUsuario}")
    public ResponseEntity<List<PacienteConvenio>> getUsuarioConveniosByPacienteId(@PathVariable Integer idPaciente) {
        List<PacienteConvenio> usuarioConvenios = pacienteConvenioService.findByPacienteId(idPaciente);
        return ResponseEntity.ok(usuarioConvenios);
    }

    @GetMapping("/plano/{idPlano}")
    public ResponseEntity<List<PacienteConvenio>> getUsuarioConveniosByPlanoId(@PathVariable Integer idPlano) {
        List<PacienteConvenio> usuarioConvenios = pacienteConvenioService.findByPlanoId(idPlano);
        return ResponseEntity.ok(usuarioConvenios);
    }

    @PostMapping
    public ResponseEntity<PacienteConvenio> createPacienteConvenio(@RequestBody PacienteConvenio pacienteConvenio) {
    	PacienteConvenio novoPacienteConvenio = pacienteConvenioService.savePacienteConvenio(pacienteConvenio);
        return ResponseEntity.ok(novoPacienteConvenio);
    }

    @DeleteMapping("/{idUsuario}/{idPlano}")
    public ResponseEntity<Void> deletePacienteConvenio(@PathVariable Integer idPaciente, @PathVariable Integer idPlano) {
    	pacienteConvenioService.deletePacienteConvenio(idPaciente, idPlano);
        return ResponseEntity.noContent().build();
    }
}
