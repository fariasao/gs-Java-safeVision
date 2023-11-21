package com.gs.services;

import com.gs.entities.Usuario;
import com.gs.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findUsuarioById(Integer id) {
        return usuarioRepository.findById(id);
    }

    public Usuario saveUsuario(Usuario usuario) {
        // Aqui podem ser adicionadas validações ou lógica de negócios
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(Integer id, Usuario usuarioDetails) {
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuario.setNomeUsuario(usuarioDetails.getNomeUsuario());
        usuario.setEmailUsuario(usuarioDetails.getEmailUsuario());
        usuario.setSenhaUsuario(usuarioDetails.getSenhaUsuario());
        usuario.setTelefoneUsuario(usuarioDetails.getTelefoneUsuario());
        usuario.setDataNascimento(usuarioDetails.getDataNascimento());
        usuario.setPaciente(usuarioDetails.getPaciente());

        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
