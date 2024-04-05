package hn.unah.lenguajes1900.demo.repositories;

import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.demo.entities.Usuario;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{   
}
