package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class prueba {

    @GetMapping("/ahora")
    public String llamarAhora(){

        return"todo";
    }
}
