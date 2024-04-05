package hn.unah.lenguajes1900.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.demo.entities.Empleado;
import hn.unah.lenguajes1900.demo.entities.HistoricoPagos;

@Repository
public interface HistoricoPagosRepository extends CrudRepository<HistoricoPagos,Long>{

    public List<HistoricoPagos> findByEmpleado(Empleado Empleado);
    
}
