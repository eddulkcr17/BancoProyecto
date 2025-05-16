package main.java.com.banco.api_cliente.dto;

import lombok.Data;

@Data
public class ClienteDTO {
    private Long clienteId;
    private String nombre;
    private String identificacion;
    private boolean estado;

}
