package com.carritoweb.shoplite.service;

import com.carritoweb.shoplite.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> ListarUsuarios();
    Optional<Usuario> obtenerUsuarioPorid(Integer id);
    Usuario guardarUsuario(Usuario usuario);
    Usuario actualizarUsuario(Integer id, Usuario usuario);
    void eliminarUsuario(Integer id);

}
