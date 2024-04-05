package hn.unah.lenguajes1900.demo.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="historicopagos")
@Data
public class HistoricoPagos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="idhistoricopagos")
    private long idHistoricoPagos;


    private LocalDate FechaPago;

    @Column(name="horastrabajadas")
    private int HorasTrabajadas;

    @Column(name="precioporhora")
    private double precioPorHora;

    @Column(name="totalSueldo")
    private double totalSueldo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="dni" , referencedColumnName = "dni")
    private Empleado empleado;
    
}
