package pe.edu.cibertec.appgrupo7productor.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appgrupo7productor.config.RabbitMQConfig;

@Service
public class RabbitMQProducerService {

    private final RabbitTemplate rabbitTemplate;

    public RabbitMQProducerService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE_NAME,
                RabbitMQConfig.ROUTING_KEY,
                message
        );
    }
}