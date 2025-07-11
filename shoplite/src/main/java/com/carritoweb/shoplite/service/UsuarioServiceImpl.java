package com.carritoweb.shoplite.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritoweb.shoplite.model.Usuario;
import com.carritoweb.shoplite.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }

    public List<Usuario> ListarUsuarios(){
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> obtenerUsuarioPorid(Integer id){
        return usuarioRepository.findById(id);
    }
    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public Usuario actualizarUsuario(Integer id, Usuario usuario){
        usuario.setIdUsuario(id);
        return usuarioRepository.save(usuario);
    }
    public void eliminarUsuario(Integer id){
        usuarioRepository.deleteById(id);
    }

}
