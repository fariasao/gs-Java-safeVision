package com.gs.services;

import com.gs.entities.UsuarioConvenio;
import com.gs.repositories.UsuarioConvenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioConvenioService {

    private final UsuarioConvenioRepository usuarioConvenioRepository;

    @Autowired
    public UsuarioConvenioService(UsuarioConvenioRepository usuarioConvenioRepository) {
        this.usuarioConvenioRepository = usuarioConvenioRepository;
    }

    public List<UsuarioConvenio> getAllUsuarioConvenios() {
        return usuarioConvenioRepository.findAll();
    }

    public List<UsuarioConvenio> findByUsuarioId(Integer idUsuario) {
        return usuarioConvenioRepository.findByUsuarioId(idUsuario);
    }

    public List<UsuarioConvenio> findByPlanoId(Integer idPlano) {
        return usuarioConvenioRepository.findByPlanoId(idPlano);
    }

    public UsuarioConvenio saveUsuarioConvenio(UsuarioConvenio usuarioConvenio) {
        return usuarioConvenioRepository.save(usuarioConvenio);
    }

    public void deleteUsuarioConvenio(Integer idUsuario, Integer idPlano) {
        usuarioConvenioRepository.deleteByIdUsuarioAndIdPlano(idUsuario, idPlano);
    }
}
