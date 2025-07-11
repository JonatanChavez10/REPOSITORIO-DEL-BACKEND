package com.carritoweb.shoplite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.carritoweb.shoplite.model.DetallePedido;
import com.carritoweb.shoplite.model.DetallePedidoId;
import com.carritoweb.shoplite.service.DetallePedidoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/DetallePedidos")
public class DetallePedidoController {
    private DetallePedidoService detallePedidoService;
    
    @Autowired
    public DetallePedidoController(DetallePedidoService detallePedidoService){
        this.detallePedidoService=detallePedidoService;
    }

    @GetMapping
    public List<DetallePedido> listar(){
        return detallePedidoService.listarDetallePedido();
    }

    @GetMapping("/{pedidoId}/{articuloId}")
    public ResponseEntity<DetallePedido> obtenerPorId(
    @PathVariable Integer pedidoId,
    @PathVariable Integer articuloId) {

    DetallePedidoId id = new DetallePedidoId(pedidoId, articuloId);
    return detallePedidoService.obtenerDetallePedidoPorId(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DetallePedido crear(@RequestBody DetallePedido detallePedido){
       
        return detallePedidoService.guardarArticulo(detallePedido);
    }

    @DeleteMapping("/{pedidoId}/{articuloId}")
    public ResponseEntity<Void> eliminar(
    @PathVariable Integer pedidoId,
    @PathVariable Integer articuloId) {

    DetallePedidoId id = new DetallePedidoId(pedidoId, articuloId);
    if(detallePedidoService.obtenerDetallePedidoPorId(id).isEmpty()){
        return ResponseEntity.notFound().build();
    }

    detallePedidoService.eliminarDetallePedido(id);
    return ResponseEntity.noContent().build();
    }

}
