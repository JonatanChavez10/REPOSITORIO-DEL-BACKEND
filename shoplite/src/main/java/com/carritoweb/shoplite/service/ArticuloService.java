package com.carritoweb.shoplite.service;

import com.carritoweb.shoplite.model.Articulo;
import java.util.List;
import java.util.Optional;

public interface ArticuloService {
    List<Articulo> listarArticulos();
    Optional<Articulo> obtenerArticuloPorId(Integer id);
    Articulo guardarArticulo(Articulo articulo);
    Articulo actualizarArticulo(Integer id, Articulo articulo);
    void eliminarArticulo(Integer id);


}
