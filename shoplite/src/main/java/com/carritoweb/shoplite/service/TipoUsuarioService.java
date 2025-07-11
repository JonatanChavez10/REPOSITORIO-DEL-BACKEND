package com.carritoweb.shoplite.service;

import java.util.List;
import java.util.Optional;

import com.carritoweb.shoplite.model.TiposUsuario;

public interface TipoUsuarioService {
    List<TiposUsuario> listarTipoUsuarios();
    Optional<TiposUsuario> obtenerTipoUsuarioPorid(Integer id);
    TiposUsuario guardarTiposUsuario(TiposUsuario tiposUsuario);
    TiposUsuario actualizarTiposUsuario(Integer id, TiposUsuario tiposUsuario);
    void eliminarTipoUsuario(Integer id);
}
