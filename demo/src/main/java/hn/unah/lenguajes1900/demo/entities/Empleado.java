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

    //Hola mundo y todos
    

//     //Metodo de tipo streaming para hacerlo manual el crear
//     package hn.unah.lenguajes1900.datos.demo.services.impl;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import hn.unah.lenguajes1900.datos.demo.entities.Planes;
// import hn.unah.lenguajes1900.datos.demo.entities.TipoStreaming;
// import hn.unah.lenguajes1900.datos.demo.repositories.PlanRepository;
// import hn.unah.lenguajes1900.datos.demo.repositories.TipoStreamingRepository;
// import hn.unah.lenguajes1900.datos.demo.services.TipoStreamingService;

// @Service
// public class TipoStreamingServiceImpl implements TipoStreamingService{

//     @Autowired
//     private TipoStreamingRepository tipoStreamingRepository;

//     @Autowired
//     private PlanRepository planRepository;

//     @Override
//     public TipoStreaming crearStreaming(TipoStreaming tipoStreaming) { 
//         TipoStreaming tipoStreaming2 = this.tipoStreamingRepository.save(tipoStreaming);
//         if(null!= tipoStreaming.getPlanes()){
//             for (Planes plan : tipoStreaming.getPlanes()) {
//                 plan.setTipoStreaming(tipoStreaming2);
//                 this.planRepository.save(plan);
//             }
//         }
//         return tipoStreaming2;
//     }

//     @Override
//     public List<TipoStreaming> obtenerStreaming() {
//         return (List<TipoStreaming>) this.tipoStreamingRepository.findAll();
//     }
    
// }

}
