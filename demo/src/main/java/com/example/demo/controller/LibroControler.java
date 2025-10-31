package com.example.demo.controller;

import com.example.demo.entity.Libro;
import com.example.demo.service.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")

public class LibroControler {

    @Autowired
    private LibroServiceImpl libroServiceImpl; // Se inyecta la dependencia

    @GetMapping
    public List<Libro> obtenerTodos() {
        return this.libroServiceImpl.getLibros();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibro(@PathVariable Long id) {
        return this.libroServiceImpl.getLibro(id);
    }

    @PostMapping
    public void guardarOActualizarLibro(@RequestBody Libro libro) {
        this.libroServiceImpl.guardarOActualizarLibro(libro);
    }

    @DeleteMapping("/{libroId}")
    public void eliminarLibro(@PathVariable("libroId") Long libroId) {
        this.libroServiceImpl.eliminarLibro(libroId);
    }
}
