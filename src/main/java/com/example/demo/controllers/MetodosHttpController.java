package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

    @GetMapping
    public String get() {
        return "Requisicao GET";
    }

    @PostMapping
    public String post() {
        return "Requisicao POST";
    }


    @PutMapping
    public String put() {
        return "Requisicao PUT";
    }

    @PatchMapping
    public String patch() {
        return "Requisicao PATCH";
    }

    @DeleteMapping
    public String delete() {
        return "Requisicao DELETE";
    }

}
