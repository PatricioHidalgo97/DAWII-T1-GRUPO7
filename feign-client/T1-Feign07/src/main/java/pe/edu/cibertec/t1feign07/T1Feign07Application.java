package pe.edu.cibertec.t1feign07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class T1Feign07Application {

    public static void main(String[] args) {
        SpringApplication.run(T1Feign07Application.class, args);
    }

}
