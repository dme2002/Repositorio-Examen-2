package hn.unah.lenguajes1900.demo.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.HistoricoPagos;
import hn.unah.lenguajes1900.demo.services.historicopagosService;

@Service
public class historicopagosServiceImpl implements historicopagosService{

    @Override
    public List<HistoricoPagos> ListaDePagosEspecificos(long dni, LocalDate fechaInicio, LocalDate fechaFinal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ListaDePagosEspecificos'");
    }

    @Override
    public String CrearPagoaEmpleado(long dni, int HorasTrabajadas, double precioPorHora) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CrearPagoaEmpleado'");
    }
    
}
