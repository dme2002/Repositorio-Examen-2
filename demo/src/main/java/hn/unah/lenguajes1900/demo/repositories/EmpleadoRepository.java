package hn.unah.lenguajes1900.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.demo.entities.Empleado;


@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado,Long>{


    
}
