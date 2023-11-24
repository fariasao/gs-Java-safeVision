package com.gs.controllers;

import com.gs.entities.Resultado;
import com.gs.services.ResultadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resultados")
public class ResultadoController {

    private final ResultadoService resultadoService;

    @Autowired
    public ResultadoController(ResultadoService resultadoService) {
        this.resultadoService = resultadoService;
    }

    @GetMapping
    public List<Resultado> getAllResultados() {
        return resultadoService.getAllResultados();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resultado> getResultadoById(@PathVariable Integer id) {
        Resultado resultado = resultadoService.findResultadoById(id)
            .orElseThrow(() -> new RuntimeException("Resultado não encontrado"));
        return ResponseEntity.ok(resultado);
    }

    @PostMapping
    public ResponseEntity<?> createResultado(@RequestBody Resultado resultado) {
        try {
            Resultado novoResultado = resultadoService.saveResultado(resultado);
            return ResponseEntity.ok(novoResultado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao criar o resultado: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateResultado(@PathVariable Integer id, @RequestBody Resultado resultado) {
        try {
            Resultado resultadoAtualizado = resultadoService.updateResultado(id, resultado);
            return ResponseEntity.ok(resultadoAtualizado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao atualizar o resultado: " + e.getMessage());
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResultado(@PathVariable Integer id) {
        resultadoService.deleteResultado(id);
        return ResponseEntity.noContent().build();
    }
}
