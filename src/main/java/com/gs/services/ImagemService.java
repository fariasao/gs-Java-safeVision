package com.gs.services;

import com.gs.entities.Imagem;
import com.gs.repositories.ImagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImagemService {

    private final ImagemRepository imagemRepository;

    @Autowired
    public ImagemService(ImagemRepository imagemRepository) {
        this.imagemRepository = imagemRepository;
    }

    public List<Imagem> getAllImagens() {
        return imagemRepository.findAll();
    }

    public Optional<Imagem> findImagemById(Integer id) {
        return imagemRepository.findById(id);
    }

    public Imagem saveImagem(Imagem imagem) {
        return imagemRepository.save(imagem);
    }

    public Imagem updateImagem(Integer id, Imagem imagemDetails) {
        Imagem imagem = imagemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Imagem não encontrada"));

        imagem.setPaciente(imagemDetails.getPaciente());
        imagem.setDataArquivo(imagemDetails.getDataArquivo());
        imagem.setCaminhoArquivos(imagemDetails.getCaminhoArquivos());
        imagem.setObservacoes(imagemDetails.getObservacoes());

        return imagemRepository.save(imagem);
    }

    public void deleteImagem(Integer id) {
        imagemRepository.deleteById(id);
    }
}
