package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BienvenidaControler {

    @GetMapping
public String bienvenida(){return "Bienvenido Camarada";}
}
