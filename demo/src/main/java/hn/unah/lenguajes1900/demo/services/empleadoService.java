package hn.unah.lenguajes1900.demo.services;

import java.util.List;

import hn.unah.lenguajes1900.demo.entities.Empleado;

public interface empleadoService {

    public Empleado crearEmpleado(Empleado empleado);
    public List<Empleado> obtenerEmpleados();
    public Empleado obtenerEmpleado(long id);
    public String eliminarEmpleado(long id);
    
    
}
