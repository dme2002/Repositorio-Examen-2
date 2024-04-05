package hn.unah.lenguajes1900.demo.services;

import java.util.List;

import hn.unah.lenguajes1900.demo.entities.Usuario;
import java.util.Optional;

public interface usuarioService {

    public Usuario crearUsuario(Usuario usuario);
    public List<Usuario> obtenerUsuarios();
    public Optional<Usuario> buscarPorId(long id);
    public String eliminarUsuario(long id);

    
}
