package com.carritoweb.shoplite.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritoweb.shoplite.model.Pedido;
import com.carritoweb.shoplite.repository.PedidoRepository;
@Service
public class PedidoServiceImpl implements PedidoService{
    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoServiceImpl(PedidoRepository pedidoRepository){
        this.pedidoRepository=pedidoRepository;
    }

    public List<Pedido> listarPedido(){
        return pedidoRepository.findAll();

    }
    public Optional<Pedido> obtenerPedidoPorId(Integer id){
        return pedidoRepository.findById(id);
    }
    public Pedido guardarPedido(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
    public Pedido actualizarPedido(Integer id, Pedido pedido){
        pedido.setIdPedido(id);
        return pedidoRepository.save(pedido);
    }
    public void eliminarPedido(Integer id){
        pedidoRepository.deleteById(id);   
    }
}
