package com.gs.repositories;

import com.gs.entities.InformacaoDetalhada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformacaoDetalhadaRepository extends JpaRepository<InformacaoDetalhada, Integer> {
    // Métodos adicionais de consulta podem ser definidos aqui, se necessário
}
