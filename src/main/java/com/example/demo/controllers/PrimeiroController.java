package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @GetMapping(path = "/ola")
    public String ola() {
        return "Ola Spring Boot!";
    }

    @GetMapping(path = "/saudacao")
    public String saudacao() {
        return "Ola Spring boot (poost)!";
    }
}
