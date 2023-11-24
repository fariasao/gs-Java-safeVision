package com.gs.bo;

import com.gs.entities.Imagem;
import com.gs.repositories.ImagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImagemBO {

    private final ImagemRepository imagemRepository;

    @Autowired
    public ImagemBO(ImagemRepository imagemRepository) {
        this.imagemRepository = imagemRepository;
    }

    public Imagem cadastrarImagem(Imagem imagem) throws Exception {
        validarImagem(imagem);
        return imagemRepository.save(imagem);
    }

    public Imagem atualizarImagem(Integer id, Imagem detalhesImagem) throws Exception {
        Imagem imagem = imagemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Imagem não encontrada"));

        atualizarDadosImagem(imagem, detalhesImagem);
        return imagemRepository.save(imagem);
    }

    private void validarImagem(Imagem imagem) throws Exception {
        if (imagem.getCaminhoArquivos() == null || imagem.getDataArquivo() == null) {
            throw new Exception("Dados da imagem são inválidos");
        }
    }

    private void atualizarDadosImagem(Imagem imagem, Imagem detalhes) {
        imagem.setPaciente(detalhes.getPaciente());
        imagem.setDataArquivo(detalhes.getDataArquivo());
        imagem.setCaminhoArquivos(detalhes.getCaminhoArquivos());
        imagem.setObservacoes(detalhes.getObservacoes());
    }
}
