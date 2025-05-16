package com.banco.api_gateway.dao;

import com.banco.api_gateway.model.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RutaRepository extends JpaRepository<Ruta, Long>{
     List<Ruta> findByHabilitadoTrue();
}
