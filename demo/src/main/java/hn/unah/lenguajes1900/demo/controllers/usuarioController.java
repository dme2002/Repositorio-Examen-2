package hn.unah.lenguajes1900.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.demo.entities.Usuario;
import hn.unah.lenguajes1900.demo.services.impl.usuarioServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class usuarioController {
    
    @Autowired
    private usuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/usuario/guardar")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return this.usuarioServiceImpl.crearUsuario(usuario);
    }

    @GetMapping("/usuario/obtener")
    public List<Usuario> obtenerUsuarios(){
        return this.usuarioServiceImpl.obtenerUsuarios();
    }

    @GetMapping("/usuario/buscar")
    public Optional<Usuario> buscarPorId(@RequestParam long id) {
        return this.usuarioServiceImpl.buscarPorId(id);
    }


    @DeleteMapping("/usuario/eliminar")
    public String eliminarUsuario(@RequestParam long id) {
        return this.usuarioServiceImpl.eliminarUsuario(id);
    }

    





    
}
