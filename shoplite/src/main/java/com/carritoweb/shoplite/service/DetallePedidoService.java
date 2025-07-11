package com.carritoweb.shoplite.service;

import java.util.List;
import java.util.Optional;

import com.carritoweb.shoplite.model.DetallePedido;
import com.carritoweb.shoplite.model.DetallePedidoId;

public interface DetallePedidoService {

    List<DetallePedido> listarDetallePedido();
    Optional<DetallePedido> obtenerDetallePedidoPorId(DetallePedidoId id);
    DetallePedido guardarArticulo(DetallePedido detallePedido);
    //DetallePedido actualizarArticulo(Long id, DetallePedido detallePedido);
    void eliminarDetallePedido(DetallePedidoId id);
}
