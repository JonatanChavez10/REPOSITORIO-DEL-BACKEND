package com.carritoweb.shoplite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carritoweb.shoplite.model.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Integer>{

}
