package br.ifsp.edu.heigostosospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;

@SpringBootApplication
@RestController
public class HeigostosoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeigostosoSpringApplication.class, args);
    }

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
