package com.carritoweb.shoplite.repository;

import com.carritoweb.shoplite.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByNombreAndClave(String nombre, String clave);
    boolean existsByNombre(String nombre);
}