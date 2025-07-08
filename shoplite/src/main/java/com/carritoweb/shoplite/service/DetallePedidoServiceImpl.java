package com.carritoweb.shoplite.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritoweb.shoplite.model.DetallePedido;
import com.carritoweb.shoplite.model.DetallePedidoId;
import com.carritoweb.shoplite.repository.DetallePedidoRepository;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {

    private final DetallePedidoRepository detallePedidoRepository;//Inyeccion de dependencia

    @Autowired
    public DetallePedidoServiceImpl(DetallePedidoRepository detallePedidoRepository){
        this.detallePedidoRepository=detallePedidoRepository;
    }

    public List<DetallePedido> listarDetallePedido(){
        return detallePedidoRepository.findAll();
    }
    public Optional<DetallePedido> obtenerDetallePedidoPorId(DetallePedidoId id){
        return detallePedidoRepository.findById(id);
    }
    public DetallePedido guardarArticulo(DetallePedido detallePedido){
        return detallePedidoRepository.save(detallePedido);
    }
    /*DetallePedido actualizarArticulo(Long id, DetallePedido detallePedido){
        
    }*/
    public void eliminarDetallePedido(DetallePedidoId id){
        detallePedidoRepository.deleteById(id);
    }

}
