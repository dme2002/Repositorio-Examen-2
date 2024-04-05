package hn.unah.lenguajes1900.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="usuarios")
@Data
public class Usuario {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigousuario")
    private long codigoUsuario;

    private String nombre;
    private String apellido;
    private String departamento;
    private String correo;
    private String telefono;

    @OneToOne(cascade = CascadeType.ALL) //Si se elimina un usuario se elimina la direccion tambien 

    @JoinColumn(name = "idperfil", referencedColumnName = "idperfil")
    private Perfiles perfil;

}
