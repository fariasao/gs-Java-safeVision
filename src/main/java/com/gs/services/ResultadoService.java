package com.gs.services;

import com.gs.bo.ResultadoBO;
import com.gs.entities.Resultado;
import com.gs.repositories.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultadoService {

	private final ResultadoRepository resultadoRepository;
    private final ResultadoBO resultadoBO;

    @Autowired
    public ResultadoService(ResultadoRepository resultadoRepository, ResultadoBO resultadoBO) {
        this.resultadoRepository = resultadoRepository;
        this.resultadoBO = resultadoBO;
    }
    public List<Resultado> getAllResultados() {
        return resultadoRepository.findAll();
    }

    public Optional<Resultado> findResultadoById(Integer id) {
        return resultadoRepository.findById(id);
    }

    public Resultado saveResultado(Resultado resultado) throws Exception {
        return resultadoBO.cadastrarResultado(resultado);
    }

    public Resultado updateResultado(Integer id, Resultado resultadoDetails) throws Exception {
        return resultadoBO.atualizarResultado(id, resultadoDetails);
    }

    public void deleteResultado(Integer id) {
        resultadoRepository.deleteById(id);
    }
}
