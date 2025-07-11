package com.carritoweb.shoplite.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
@Embeddable
public class DetallePedidoId implements Serializable{
    @Column(name = "id_pedido")
    private Integer pedidoId;
    @Column(name = "id_Articulo")
    private Integer articuloId;

    // constructor por defecto
    public DetallePedidoId() {}

    public DetallePedidoId(Integer pedidoId, Integer articuloId) {
        this.pedidoId = pedidoId;
        this.articuloId = articuloId;
    }

    // getters, setters, equals y hashCode
    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getArticuloId() {
        return articuloId;
    }

    public void setArticuloId(Integer articuloId) {
        this.articuloId = articuloId;
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetallePedidoId)) return false;
        DetallePedidoId that = (DetallePedidoId) o;
        return Objects.equals(pedidoId, that.pedidoId) &&
               Objects.equals(articuloId, that.articuloId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedidoId, articuloId);
    }
}
