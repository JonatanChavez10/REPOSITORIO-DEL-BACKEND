package com.carritoweb.shoplite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carritoweb.shoplite.model.DetallePedido;
import com.carritoweb.shoplite.model.DetallePedidoId;
@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, DetallePedidoId>{

}
