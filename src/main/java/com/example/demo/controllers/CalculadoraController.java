package com.example.demo.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    @GetMapping
    public String get() {
        return "Requisicao GET";
    }

    // /calculadora/somar/10/20

    @GetMapping("/somar/{a}/{b}")
    public  int somar(@PathVariable int a, @PathVariable int b){
        return a + b;
    }

    // /calculadora/subtrair?a=100&b=39


    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return a - b;
    }

}
