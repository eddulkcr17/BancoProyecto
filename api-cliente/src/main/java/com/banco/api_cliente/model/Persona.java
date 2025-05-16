package main.java.com.banco.api_cliente.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "personas")
@Inheritance(strategy = InheritanceType.JOINED) // Para la herencia con Cliente
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String genero;
    private int edad;
    private String identificacion;
    private String direccion;
    private String telefono;

}
