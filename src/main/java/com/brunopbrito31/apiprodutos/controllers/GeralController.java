package com.brunopbrito31.apiprodutos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GeralController {
    

    @GetMapping("/login")
    public void autenticar(){
        System.out.println("oi");
    }
}
