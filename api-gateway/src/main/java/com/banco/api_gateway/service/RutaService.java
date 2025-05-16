package com.banco.api_gateway.service;

import com.banco.api_gateway.model.Ruta;
import com.banco.api_gateway.dao.RutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RutaService {

    private final RutaRepository rutaRepository;

    @Autowired
    public RutaService(RutaRepository rutaRepository) {
        this.rutaRepository = rutaRepository;
    }

    public List<Ruta> obtenerRutasHabilitadas() {
        return rutaRepository.findByHabilitadoTrue();
    }
}
