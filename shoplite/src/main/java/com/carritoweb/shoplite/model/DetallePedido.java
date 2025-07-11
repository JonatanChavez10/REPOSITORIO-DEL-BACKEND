package com.carritoweb.shoplite.model;

import jakarta.persistence.*;

@Entity
@Table(name = "detallespedidos")
public class DetallePedido {
    @EmbeddedId
    private DetallePedidoId idPedido;

    @ManyToOne
    @MapsId("pedidoId")
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @ManyToOne
    @MapsId("articuloId")
    @JoinColumn(name = "id_Articulo")
    private Articulo articulo;

    private int cantidad;
    private double precioUnitario;

    // getters y setters
    public DetallePedido(){}

    public DetallePedido(Pedido pedido, Articulo articulo, int cantidad, double precioUnitario) {
        this.pedido = pedido;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        // Inicializa la clave compuesta DetallePedidoId
        // Es VITAL que los tipos de idPedido y idArticulo en DetallePedidoId
        // coincidan con los tipos de getIdPedido() en Pedido y getIdArticulo() en Articulo.
        // Asumiendo que Pedido.getIdPedido() y Articulo.getIdArticulo() devuelven Integer.
        this.idPedido = new DetallePedidoId(pedido.getIdPedido(), articulo.getIdArticulo());
    }

    public DetallePedidoId getId() {
        return idPedido;
    }

    public void setId(DetallePedidoId id) {
        this.idPedido = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

}
