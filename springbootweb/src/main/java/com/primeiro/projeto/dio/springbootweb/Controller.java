package com.primeiro.projeto.dio.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String message() {
        return "Nosso primeiro projeto Spring Boot Web";
    }
}
