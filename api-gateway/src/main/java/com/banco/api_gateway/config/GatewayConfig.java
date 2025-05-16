package com.banco.api_gateway.config;

import com.banco.api_gateway.model.Ruta;
import com.banco.api_gateway.service.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import java.util.List;

@Configuration
public class GatewayConfig {
    private final RutaService rutaService;

    @Autowired
    public GatewayConfig(RutaService rutaService) {
        this.rutaService = rutaService;
    }

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();

        List<Ruta> rutas = rutaService.obtenerRutasHabilitadas();

        rutas.forEach(ruta -> {
            routes.route(ruta.getId().toString(), r -> r
                .path(ruta.getPath())
                .and()
                .method(HttpMethod.valueOf(ruta.getMetodo()))
                .uri(ruta.getUri())
            );
        });

        return routes.build();
    }
}
