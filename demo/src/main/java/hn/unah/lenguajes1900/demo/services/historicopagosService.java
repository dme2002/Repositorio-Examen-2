package hn.unah.lenguajes1900.demo.services;

import java.time.LocalDate;
import java.util.List;

import hn.unah.lenguajes1900.demo.entities.HistoricoPagos;

public interface historicopagosService {

   public List<HistoricoPagos> ListaDePagosEspecificos(long dni, LocalDate fechaInicio, LocalDate fechaFinal);

   public String CrearPagoaEmpleado (long dni, int HorasTrabajadas, double precioPorHora);
    
}
