package com.gs.repositories;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gs.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
	Optional<Paciente> findByIdPaciente(Integer idUsuario);
}
