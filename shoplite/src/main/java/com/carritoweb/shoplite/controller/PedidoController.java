package com.carritoweb.shoplite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carritoweb.shoplite.model.Pedido;
import com.carritoweb.shoplite.service.PedidoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService){
        this.pedidoService=pedidoService;
    }

    @GetMapping
    public List<Pedido> listar(){
        return pedidoService.listarPedido();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> obtenerPorId(@PathVariable Integer id){
        return pedidoService.obtenerPedidoPorId(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pedido crear(@RequestBody Pedido pedido){
        return pedidoService.guardarPedido(pedido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> actualizar(@PathVariable Integer id,@RequestBody Pedido pedido){
        if(pedidoService.obtenerPedidoPorId(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pedidoService.actualizarPedido(id, pedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        if(pedidoService.obtenerPedidoPorId(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        pedidoService.eliminarPedido(id);
        return ResponseEntity.noContent().build();
    }

}
