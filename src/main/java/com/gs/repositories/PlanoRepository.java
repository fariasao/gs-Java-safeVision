package com.gs.repositories;

import com.gs.entities.Plano;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoRepository extends JpaRepository<Plano, Integer> {
	Optional<Plano> findByIdPlano(Integer idPlano);
}
