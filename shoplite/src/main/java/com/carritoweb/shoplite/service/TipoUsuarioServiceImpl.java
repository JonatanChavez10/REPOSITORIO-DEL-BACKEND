package com.carritoweb.shoplite.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritoweb.shoplite.model.TiposUsuario;
import com.carritoweb.shoplite.repository.TiposUsuarioRepository;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService {

    private final TiposUsuarioRepository tiposUsuarioRepository;

    @Autowired
    public TipoUsuarioServiceImpl(TiposUsuarioRepository tiposUsuarioRepository){
        this.tiposUsuarioRepository=tiposUsuarioRepository;
    }

    public List<TiposUsuario> listarTipoUsuarios(){
        return tiposUsuarioRepository.findAll();
    }
    public Optional<TiposUsuario> obtenerTipoUsuarioPorid(Integer id){
        return tiposUsuarioRepository.findById(id);
    }
    public TiposUsuario guardarTiposUsuario(TiposUsuario tiposUsuario){
        return tiposUsuarioRepository.save(tiposUsuario);
    }
    public TiposUsuario actualizarTiposUsuario(Integer id, TiposUsuario tiposUsuario){
        tiposUsuario.setIdTipoUsuario(id);
        return tiposUsuarioRepository.save(tiposUsuario);
    }
    public void eliminarTipoUsuario(Integer id){
        tiposUsuarioRepository.deleteById(id);  
    }

}
