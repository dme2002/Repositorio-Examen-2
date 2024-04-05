package hn.unah.lenguajes1900.demo.services.impl;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.Empleado;
import hn.unah.lenguajes1900.demo.entities.HistoricoPagos;
import hn.unah.lenguajes1900.demo.repositories.EmpleadoRepository;
import hn.unah.lenguajes1900.demo.repositories.HistoricoPagosRepository;
import hn.unah.lenguajes1900.demo.services.historicopagosService;

@Service
public class historicopagosServiceImpl implements historicopagosService{

    private static final ChronoLocalDate FechaFin = null;
    private EmpleadoRepository empleadoRepository;
    private HistoricoPagosRepository historicoPagosRepository;

    @Override
    public List<HistoricoPagos> ListaDePagosEspecificos(long dni, LocalDate fechaInicio, LocalDate fechaFinal) {
        Empleado empleadoespecifico =this.empleadoRepository.findById(dni).get();
    List<HistoricoPagos> listahistorica = this.historicoPagosRepository.findByEmpleado(empleadoespecifico);
    List<HistoricoPagos> listaespecifica = new ArrayList<HistoricoPagos>();
        for (int i=0;i<listahistorica.size();i++){
            LocalDate FechaCorrespondiente = listahistorica.get(i).getFechaPago();
            if (FechaCorrespondiente.isAfter(fechaInicio) && FechaCorrespondiente.isBefore(FechaFin)){
                listaespecifica.add(listahistorica.get(i));
            }
        }
        return listaespecifica;
    }

    @Override
    public String CrearPagoaEmpleado(long dni, int HorasTrabajadas, double precioPorHora) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CrearPagoaEmpleado'");
    }
    
}
