package hn.unah.lenguajes1900.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.Usuario;
import hn.unah.lenguajes1900.demo.repositories.UsuarioRepository;
import hn.unah.lenguajes1900.demo.services.usuarioService;

@Service
public class usuarioServiceImpl implements usuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;


    @SuppressWarnings("null")
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        return (List<Usuario>) this.usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> buscarPorId(long id) {
        return this.usuarioRepository.findById(id);
        
    }

    @Override
    public String eliminarUsuario(long id) {
        if(this.usuarioRepository.findById(id).isPresent()){
            this.usuarioRepository.deleteById(id);
            return "Usuario Eliminado";
        }       

        return "El usuario no existe";
    }
    
    
}
