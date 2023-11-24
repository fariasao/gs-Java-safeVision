package com.gs.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gs.entities.Dependente;

public interface DependenteRepository extends JpaRepository<Dependente, Integer> {
    
}
