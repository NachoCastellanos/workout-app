package com.castemore.workout_app_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hola")
    public String sayHello() {
        return "Hola Mundo me llamo Nacho y este es el segundo commit";
    }
}
