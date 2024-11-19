package com.aplicaciones.aplicaciones.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.aplicaciones.aplicaciones.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>(
        Arrays.asList(new Usuario(1223, "Mauricio", "Estupiñan") 
    ));

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    @PostMapping("/usuario")
    public Usuario postusuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }
    
    

}
