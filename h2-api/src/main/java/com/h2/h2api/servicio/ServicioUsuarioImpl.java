package com.h2.h2api.servicio;

import com.h2.h2api.modelo.Usuario;
import com.h2.h2api.repositorio.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ServicioUsuarioImpl implements  ServicioUsuario {

    private final RepositorioUsuario repositorioUsuario;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    @Override
    public Optional<Usuario> obtenerUsuario(Long idUsuario) {
        return Optional.ofNullable(repositorioUsuario.findById(idUsuario).orElseThrow(() -> {
            throw new RuntimeException();
        }));
    }

    @Override
    public Usuario usuarioModificar(Long id, Usuario usuarioModificar) {
        Usuario usuarioBuscado = repositorioUsuario.findById(id).get();
        usuarioBuscado.setDireccion(usuarioModificar.getDireccion());
        usuarioBuscado.setTelefono(usuarioModificar.getTelefono());

        return repositorioUsuario.save(usuarioBuscado);
    }

    @Override
    public boolean eliminarUsuario(Long id) {

        try{
            repositorioUsuario.deleteById(id);
            return  true;

        }catch(Exception e){
            return false;
        }
    }
}
