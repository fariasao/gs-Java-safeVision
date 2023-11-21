package com.gs.bo;

import com.gs.entities.Usuario;
import com.gs.repositories.UsuarioRepository;
import java.util.Optional;

public class UsuarioBO {

    private UsuarioRepository usuarioRepository;

    public UsuarioBO(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvarUsuario(Usuario usuario) {
        // Não permitir emails duplicados
        if (usuarioRepository.findByEmail(usuario.getEmailUsuario()).isPresent()) {
            throw new RuntimeException("Email já cadastrado.");
        }

        return usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuarioPorId(Integer id) {
        // Retornar usuário ou lançar exceção se não encontrado
        return usuarioRepository.findById(id).orElseThrow(
            () -> new RuntimeException("Usuário não encontrado.")
        );
    }
}
