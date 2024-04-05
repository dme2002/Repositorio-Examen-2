package hn.unah.lenguajes1900.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.Empleado;
import hn.unah.lenguajes1900.demo.repositories.EmpleadoRepository;
import hn.unah.lenguajes1900.demo.services.empleadoService;

@Service
public class empleadoServiceImpl implements empleadoService {


    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
     return this.empleadoRepository.save(empleado);
    }

    @Override
    public List<Empleado> obtenerEmpleados() {
        return (List<Empleado>) this.empleadoRepository.findAll();
    }

    @Override
    public Empleado obtenerEmpleado(long id) {
        return this.empleadoRepository.findById(id).get();
    }

    @Override
    public String eliminarEmpleado(long id) {
        this.empleadoRepository.deleteById(id);
        return "Empleado eliminado";
        
    }
    
}
