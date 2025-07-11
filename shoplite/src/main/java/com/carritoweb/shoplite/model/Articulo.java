package com.carritoweb.shoplite.model;


import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="articulos")
public class Articulo {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_Articulo")
 private Integer idArticulo;
 
@Column(nullable = false, length = 100, columnDefinition = "CHAR(100)")
 private String nombre;
 private Double precio;
 private Integer stock;
 @Column(name = "estado")
private Boolean estado;

 @OneToMany(mappedBy = "articulo")
 private List<DetallePedido> detalles;

 public Articulo(){}

 public Articulo(Integer id, String nombre, Double precio, Integer stock, boolean estado){

   this.idArticulo=id;
   this.nombre=nombre;
   this.precio=precio;
   this.stock=stock;
   this.estado=estado;
 }

 public void setid(Integer id){
    this.idArticulo=id;
 }
 public void setNombre(String nombre){
    this.nombre=nombre;
 }
 public void setPrecio(Double precio){
    this.precio=precio;
 }
 public void setStock(Integer stock){
    this.stock=stock;
 }

 public void setEstado(Boolean estado) {
    this.estado = estado;
}

 public Integer getIdArticulo(){
    return idArticulo;
 }
 public String getNombre(){
    return nombre;
 }
 public Double getPrecio(){
    return precio;
 }
 public Integer getStock(){
    return stock;
 }

 public Boolean getEstado() {
    return estado;
}



}
