package com.carritoweb.shoplite.model;


import java.util.List;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedido;

    private Integer idUsuario;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(nullable = false, columnDefinition = "BINARY(1)")
    private Boolean estado;
    @OneToMany(mappedBy = "pedido")
    private List<DetallePedido> detalles;


    public Pedido(){}

    public Pedido(Integer idpedido, Integer idUsuario, Date fecha, Boolean estado){

        this.idPedido=idpedido;
        this.idUsuario=idUsuario;
        this.fecha=fecha;
        this.estado=estado;
    }


    public void setIdPedido(Integer idpedido){
        this.idPedido=idpedido;
    }

    public void setIdUsuario(Integer idUsuario){
        this.idUsuario=idUsuario;
    }

    public void setFecha(Date fecha){
        this.fecha=fecha;
    }

    public void setEstado(Boolean estado){
        this.estado=estado;

    }

    public Integer getIdPedido(){return idPedido;}
    public Integer getIdUsuario(){return idUsuario;}
    public Date getFecha(){return fecha;}
    public Boolean getEstado(){return estado;}

}
