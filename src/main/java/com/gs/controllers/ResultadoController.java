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
    public ResponseEntity<Resultado> createResultado(@RequestBody Resultado resultado) {
        Resultado novoResultado = resultadoService.saveResultado(resultado);
        return ResponseEntity.ok(novoResultado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resultado> updateResultado(@PathVariable Integer id, @RequestBody Resultado resultado) {
        Resultado resultadoAtualizado = resultadoService.updateResultado(id, resultado);
        return ResponseEntity.ok(resultadoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResultado(@PathVariable Integer id) {
        resultadoService.deleteResultado(id);
        return ResponseEntity.noContent().build();
    }
}
