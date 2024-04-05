package hn.unah.lenguajes1900.demo.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.demo.entities.HistoricoPagos;
import hn.unah.lenguajes1900.demo.services.impl.historicopagosServiceImpl;

@RestController
@RequestMapping("/pagos")
public class historicoPagosController {
    @Autowired
    private historicopagosServiceImpl HistoricoPagoServiceimpl;

    @GetMapping("/pagos/pagosespecificos")
    public List<HistoricoPagos> ListaDePagosEspecificos(@RequestParam String dni,
                                                        @RequestParam LocalDate FechaInicio,
                                                        @RequestParam LocalDate FechaFin) {
        return this.HistoricoPagoServiceimpl.ListaDePagosEspecificos(dni, FechaInicio, FechaFin);
    }
    

    @PostMapping("/pagos/nuevopago")
    public String CrearPagoaEmpleado(@RequestParam String dni,
                                     @RequestParam int HorasTrabajadas,
                                     @RequestParam Double PrecioPorHora) {
        return this.HistoricoPagoImplementation.CrearPagoaEmpleado(dni, HorasTrabajadas, PrecioPorHora);
    }
    
}
