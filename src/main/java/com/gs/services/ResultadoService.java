package com.gs.services;

import com.gs.entities.Resultado;
import com.gs.repositories.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultadoService {

    private final ResultadoRepository resultadoRepository;

    @Autowired
    public ResultadoService(ResultadoRepository resultadoRepository) {
        this.resultadoRepository = resultadoRepository;
    }

    public List<Resultado> getAllResultados() {
        return resultadoRepository.findAll();
    }

    public Optional<Resultado> findResultadoById(Integer id) {
        return resultadoRepository.findById(id);
    }

    public Resultado saveResultado(Resultado resultado) {
        return resultadoRepository.save(resultado);
    }

    public Resultado updateResultado(Integer id, Resultado resultadoDetails) {
        Resultado resultado = resultadoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Resultado não encontrado"));

        resultado.setImagem(resultadoDetails.getImagem());
        resultado.setInformacao(resultadoDetails.getInformacao());
        resultado.setDataAnalise(resultadoDetails.getDataAnalise());
        resultado.setDiagnostico(resultadoDetails.getDiagnostico());
        resultado.setProbabilidade(resultadoDetails.getProbabilidade());
        resultado.setComentarios(resultadoDetails.getComentarios());

        return resultadoRepository.save(resultado);
    }

    public void deleteResultado(Integer id) {
        resultadoRepository.deleteById(id);
    }
}
