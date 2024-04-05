package hn.unah.lenguajes1900.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.demo.entities.HistoricoPagos;

@Repository
public interface HistoricoPagosRepository extends CrudRepository<HistoricoPagos,Long>{
    
}
