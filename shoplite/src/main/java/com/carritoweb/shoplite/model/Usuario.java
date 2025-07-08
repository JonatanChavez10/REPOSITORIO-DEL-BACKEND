package com.carritoweb.shoplite.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    @Column(name = "nombre_usuario", nullable = false, length = 100)
    private String nombre;
    @Column(nullable = false, length = 6, columnDefinition = "CHAR(6)") // Indica a Hibernate que es un tipo CHAR en la DB
    private String clave;
    private Integer idTipoUsuario;
    @Column(nullable = false, columnDefinition = "BINARY(1)")
    private Boolean estado;

    private String dni;
    private String direccion;
    private String telefono;

    public Usuario() {}

    public Usuario(Integer idUsuario, String nombre, String clave, Integer idTipoUsuario, Boolean estado,
                   String dni, String direccion, String telefono) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.clave = clave;
        this.idTipoUsuario = idTipoUsuario;
        this.estado = estado;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y setters
    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer id) { this.idUsuario = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public Integer getIdTipoUsuario() { return idTipoUsuario; }
    public void setIdTipoUsuario(Integer idTipoUsuario) { this.idTipoUsuario = idTipoUsuario; }

    public Boolean getEstado() { return estado; }
    public void setEstado(Boolean estado) { this.estado = estado; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}