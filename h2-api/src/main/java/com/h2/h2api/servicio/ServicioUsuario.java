package com.h2.h2api.servicio;

import com.h2.h2api.modelo.Usuario;

import java.util.Optional;

public interface ServicioUsuario {
    Usuario guardarUsuario(Usuario usuario);

    Optional<Usuario> obtenerUsuario(Long idUsuario);
    Usuario usuarioModificar(Long id, Usuario usuarioModificar);
    boolean eliminarUsuario(Long id);
}
