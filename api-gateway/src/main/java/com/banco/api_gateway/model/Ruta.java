package com.banco.api_gateway.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "rutas")
@Data
public class Ruta {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String path;       
    private String uri;        
    private String metodo;     
    private boolean habilitado; 

}
