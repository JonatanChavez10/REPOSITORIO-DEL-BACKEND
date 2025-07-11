package com.carritoweb.shoplite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carritoweb.shoplite.model.TiposUsuario;
import com.carritoweb.shoplite.service.TipoUsuarioService;

@CrossOrigin(origins =  "*")
@RestController
@RequestMapping("/api/TipoUsuarios")
public class TipoUsuarioController {

    private final TipoUsuarioService tipoUsuarioService;

    @Autowired
    public TipoUsuarioController(TipoUsuarioService tipoUsuarioService){
        this.tipoUsuarioService=tipoUsuarioService;
    }

    @GetMapping
    public List<TiposUsuario> Listar(){
        return tipoUsuarioService.listarTipoUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TiposUsuario> obtenerPorId(@PathVariable Integer id){
        return tipoUsuarioService.obtenerTipoUsuarioPorid(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());  
    }

    @PostMapping
    public TiposUsuario crear(@RequestBody TiposUsuario tiposUsuario){
        return tipoUsuarioService.guardarTiposUsuario(tiposUsuario);
    }

    @PostMapping("/{id}")
    public ResponseEntity<TiposUsuario> actualizar(@PathVariable Integer id, @RequestBody TiposUsuario tiposUsuario){
        if(tipoUsuarioService.obtenerTipoUsuarioPorid(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tipoUsuarioService.actualizarTiposUsuario(id, tiposUsuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar (@PathVariable Integer id){
         if(tipoUsuarioService.obtenerTipoUsuarioPorid(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        tipoUsuarioService.eliminarTipoUsuario(id);
        return ResponseEntity.noContent().build();
    }

}
