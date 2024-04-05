package hn.unah.lenguajes1900.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.demo.entities.Empleado;

import hn.unah.lenguajes1900.demo.services.impl.empleadoServiceImpl;

@RestController
@RequestMapping("/pagos")
public class empleadoController {

    @Autowired
    private empleadoServiceImpl empleadoServiceimplementation;


    @PostMapping("/empleado/crear")
     private Empleado crearEmpleado(@RequestBody Empleado empleado){
        return this.empleadoServiceimplementation.crearEmpleado(empleado);
     }

     @GetMapping("/empleado/obtener")
      public List<Empleado> obtenerEmpleados() {
    return this.empleadoServiceimplementation.obtenerEmpleados();
}


    @DeleteMapping("/empleado/eliminar/{dni}")
    public String EliminarEmpleado(@PathVariable long dni){
    return this.empleadoServiceimplementation.eliminarEmpleado(dni);
}



    






}
