package com.carritoweb.shoplite.service;

import com.carritoweb.shoplite.model.Pedido;
import java.util.List;
import java.util.Optional;

public interface PedidoService {
    List<Pedido> listarPedido();
    Optional<Pedido> obtenerPedidoPorId(Integer id);
    Pedido guardarPedido(Pedido pedido);
    Pedido actualizarPedido(Integer id, Pedido pedido);
    void eliminarPedido(Integer id);

}
