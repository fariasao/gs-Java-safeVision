package com.gs.services;

import com.gs.bo.ImagemBO;
import com.gs.entities.Imagem;
import com.gs.repositories.ImagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImagemService {

	private final ImagemRepository imagemRepository;
    private final ImagemBO imagemBO;

    @Autowired
    public ImagemService(ImagemRepository imagemRepository, ImagemBO imagemBO) {
        this.imagemRepository = imagemRepository;
        this.imagemBO = imagemBO;
    }

    public List<Imagem> getAllImagens() {
        return imagemRepository.findAll();
    }

    public Optional<Imagem> findImagemById(Integer id) {
        return imagemRepository.findById(id);
    }

    public Imagem saveImagem(Imagem imagem) throws Exception {
        return imagemBO.cadastrarImagem(imagem);
    }

    public Imagem updateImagem(Integer id, Imagem imagemDetails) throws Exception {
        return imagemBO.atualizarImagem(id, imagemDetails);
    }

    public void deleteImagem(Integer id) {
        imagemRepository.deleteById(id);
    }
}
