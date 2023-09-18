package com.calc.prestativa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public boolean registrarNovoUsuario(Usuario novoUsuario) {
        // Verificar se o nome de usuário já está em uso
        if (usuarioRepository.findByUsername(novoUsuario.getUsername()) != null) {
            return false; // Nome de usuário já está em uso
        } else {
            // Criar uma nova entrada de usuário no banco de dados
            usuarioRepository.save(novoUsuario);
            return true; // Registro bem-sucedido
        }
    }
}
