package com.gs.repositories;

import com.gs.entities.UsuarioConvenio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioConvenioRepository extends JpaRepository<UsuarioConvenio, Integer> {
    List<UsuarioConvenio> findByidUsuario(Integer idUsuario);
    List<UsuarioConvenio> findByidPlano(Integer idPlano);
    void deleteByIdUsuarioAndIdPlano(Integer idUsuario, Integer idPlano);
}
