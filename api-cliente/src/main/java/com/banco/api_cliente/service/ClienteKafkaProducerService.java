package main.java.com.banco.api_cliente.service;

import com.banco.cliente.dto.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClienteKafkaProducerService {

    private static final String TOPIC = "nuevo-cliente";

    private final KafkaTemplate<String, ClienteDTO> kafkaTemplate;

    @Autowired
    public ClienteKafkaProducerService(KafkaTemplate<String, ClienteDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarNuevoCliente(ClienteDTO clienteDTO) {
        kafkaTemplate.send(TOPIC, clienteDTO);
    }
}
