package com.carritoweb.shoplite.model;

import jakarta.persistence.*;
@Entity
@Table(name = "tiposusuarios")
public class TiposUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoUsuario;
    @Column(nullable = false, unique = true, length = 20, columnDefinition = "CHAR(20)") // Indica a Hibernate que es un tipo CHAR en la DB
    private String nombre;

    public TiposUsuario(){}

    public TiposUsuario(Integer idTipoUsuario, String nombre){

        this.idTipoUsuario=idTipoUsuario;
        this.nombre=nombre;

    }

    public void setIdTipoUsuario(Integer id){
        this.idTipoUsuario=id;

    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public Integer getIdTipoUsuario(){
        return idTipoUsuario;
    }

    public String getNombre(){
        return nombre;
    }

    
}
