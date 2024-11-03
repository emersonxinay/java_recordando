package com.example.emerson1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "¡Hola, Mundo! desde JAva";
    }
}
