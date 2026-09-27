package pe.edu.cibertec.appgrupo7productor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.appgrupo7productor.service.RabbitMQProducerService;

@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {

    private final RabbitMQProducerService producerService;

    public FibonacciController(RabbitMQProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendNumbers(
            @RequestParam String numbers) {

        producerService.sendMessage(numbers);

        return ResponseEntity.ok(
                "Lista enviada a RabbitMQ correctamente"
        );
    }
}