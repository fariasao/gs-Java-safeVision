package com.gs.controllers;

import com.gs.entities.UsuarioConvenio;
import com.gs.services.UsuarioConvenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios-convenios")
public class UsuarioConvenioController {

    private final UsuarioConvenioService usuarioConvenioService;

    @Autowired
    public UsuarioConvenioController(UsuarioConvenioService usuarioConvenioService) {
        this.usuarioConvenioService = usuarioConvenioService;
    }

    @GetMapping
    public List<UsuarioConvenio> getAllUsuarioConvenios() {
        return usuarioConvenioService.getAllUsuarioConvenios();
    }

    @GetMapping("/usuario/{idUsuario}")
    public ResponseEntity<List<UsuarioConvenio>> getUsuarioConveniosByUsuarioId(@PathVariable Integer idUsuario) {
        List<UsuarioConvenio> usuarioConvenios = usuarioConvenioService.findByUsuarioId(idUsuario);
        return ResponseEntity.ok(usuarioConvenios);
    }

    @GetMapping("/plano/{idPlano}")
    public ResponseEntity<List<UsuarioConvenio>> getUsuarioConveniosByPlanoId(@PathVariable Integer idPlano) {
        List<UsuarioConvenio> usuarioConvenios = usuarioConvenioService.findByPlanoId(idPlano);
        return ResponseEntity.ok(usuarioConvenios);
    }

    @PostMapping
    public ResponseEntity<UsuarioConvenio> createUsuarioConvenio(@RequestBody UsuarioConvenio usuarioConvenio) {
        UsuarioConvenio novoUsuarioConvenio = usuarioConvenioService.saveUsuarioConvenio(usuarioConvenio);
        return ResponseEntity.ok(novoUsuarioConvenio);
    }

    @DeleteMapping("/{idUsuario}/{idPlano}")
    public ResponseEntity<Void> deleteUsuarioConvenio(@PathVariable Integer idUsuario, @PathVariable Integer idPlano) {
        usuarioConvenioService.deleteUsuarioConvenio(idUsuario, idPlano);
        return ResponseEntity.noContent().build();
    }
}
