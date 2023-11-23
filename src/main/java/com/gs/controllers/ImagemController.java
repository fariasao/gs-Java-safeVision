package com.gs.controllers;

import com.gs.entities.Imagem;
import com.gs.services.ImagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imagens")
public class ImagemController {

    private final ImagemService imagemService;

    @Autowired
    public ImagemController(ImagemService imagemService) {
        this.imagemService = imagemService;
    }

    @GetMapping
    public List<Imagem> getAllImagens() {
        return imagemService.getAllImagens();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Imagem> getImagemById(@PathVariable Integer id) {
        Imagem imagem = imagemService.findImagemById(id)
            .orElseThrow(() -> new RuntimeException("Imagem não encontrada"));
        return ResponseEntity.ok(imagem);
    }

    @PostMapping
    public ResponseEntity<Imagem> createImagem(@RequestBody Imagem imagem) {
        Imagem novaImagem = imagemService.saveImagem(imagem);
        return ResponseEntity.ok(novaImagem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Imagem> updateImagem(@PathVariable Integer id, @RequestBody Imagem imagem) {
        Imagem imagemAtualizada = imagemService.updateImagem(id, imagem);
        return ResponseEntity.ok(imagemAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImagem(@PathVariable Integer id) {
        imagemService.deleteImagem(id);
        return ResponseEntity.noContent().build();
    }
}
