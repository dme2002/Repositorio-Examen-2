package hn.unah.lenguajes1900.demo.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Data
@Table(name="empleados")
public class Empleado {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dni")
    private long dni;

    private String nombre;
    private String apellido;
    private LocalDate fechaIngreso;

    @OneToMany(mappedBy = "empleado")
    @JsonIgnore
    private List<HistoricoPagos> HistoricoPagos;
}
