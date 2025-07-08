package com.carritoweb.shoplite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carritoweb.shoplite.model.TiposUsuario;
@Repository
public interface TiposUsuarioRepository extends JpaRepository<TiposUsuario, Integer>{

}
