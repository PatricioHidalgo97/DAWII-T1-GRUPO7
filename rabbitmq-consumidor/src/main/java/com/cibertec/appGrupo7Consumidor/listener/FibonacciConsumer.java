package com.cibertec.appGrupo7Consumidor.listener;

import com.cibertec.appGrupo7Consumidor.service.FibonacciService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Component
public class FibonacciConsumer {

    @Autowired
    private FibonacciService fibonacciService;

    @RabbitListener(queues = "${app.rabbitmq.queue}")
    public void recibirMensaje(String cadenaNumeros) throws InterruptedException {
        Integer[] integerArray = Stream.of(cadenaNumeros.split(";"))
                .map(String::trim)
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        List<Integer> positions = Arrays.asList(integerArray);

        Thread.sleep(20000); // pausa de 20 segundos

        List<Long> resultado = fibonacciService.calculateSequence(positions);

        System.out.println("Resultado Fibonacci: " + resultado);
    }
}