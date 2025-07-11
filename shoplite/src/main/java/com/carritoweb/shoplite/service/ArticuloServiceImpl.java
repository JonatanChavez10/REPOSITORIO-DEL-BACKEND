package com.carritoweb.shoplite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritoweb.shoplite.model.Articulo;

import com.carritoweb.shoplite.repository.ArticuloRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloServiceImpl implements ArticuloService{
    private final ArticuloRepository articuloRepository;

    @Autowired
    public ArticuloServiceImpl(ArticuloRepository articuloRepository){
        this.articuloRepository=articuloRepository;
    }

    public List<Articulo> listarArticulos() {
        return articuloRepository.findAll();
    }

    public Optional<Articulo> obtenerArticuloPorId(Integer id) {
        return articuloRepository.findById(id);
    }

    public Articulo guardarArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    public Articulo actualizarArticulo(Integer id, Articulo articulo) {
        Articulo existente = articuloRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Artículo no encontrado"));

        existente.setNombre(articulo.getNombre());
        existente.setPrecio(articulo.getPrecio());
        existente.setStock(articulo.getStock());

        if (articulo.getEstado() != null) {
            existente.setEstado(articulo.getEstado());
        }

        return articuloRepository.save(existente);
    }

    public void eliminarArticulo(Integer id) {
        articuloRepository.deleteById(id);
    }

}
