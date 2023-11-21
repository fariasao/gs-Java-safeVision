package com.gs.repositories;

import com.gs.entities.Informacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformacaoRepository extends JpaRepository<Informacao, Integer> {
    
}
