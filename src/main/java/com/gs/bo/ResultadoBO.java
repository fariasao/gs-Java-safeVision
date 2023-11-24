package com.gs.bo;

import com.gs.entities.Resultado;
import com.gs.repositories.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ResultadoBO {

    private final ResultadoRepository resultadoRepository;

    @Autowired
    public ResultadoBO(ResultadoRepository resultadoRepository) {
        this.resultadoRepository = resultadoRepository;
    }

    public Resultado cadastrarResultado(Resultado resultado) throws Exception {
        validarResultado(resultado);
        return resultadoRepository.save(resultado);
    }

    public Resultado atualizarResultado(Integer id, Resultado detalhesResultado) throws Exception {
        Resultado resultado = resultadoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Resultado não encontrado"));

        atualizarDadosResultado(resultado, detalhesResultado);
        return resultadoRepository.save(resultado);
    }

    private void validarResultado(Resultado resultado) throws Exception {
        if (resultado.getDiagnostico() == null || resultado.getDataAnalise() == null) {
            throw new Exception("Dados do resultado são inválidos");
        }
    }

    private void atualizarDadosResultado(Resultado resultado, Resultado detalhes) {
        resultado.setImagem(detalhes.getImagem());
        resultado.setDataAnalise(detalhes.getDataAnalise() != null ? detalhes.getDataAnalise() : new Date());
        resultado.setDiagnostico(detalhes.getDiagnostico());
        resultado.setProbabilidade(detalhes.getProbabilidade());
        resultado.setComentarios(detalhes.getComentarios());
    }
}
