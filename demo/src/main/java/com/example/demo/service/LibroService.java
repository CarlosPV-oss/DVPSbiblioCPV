package com.example.demo.service;

import com.example.demo.entity.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroService {

    List<Libro> getLibros();
    Optional<Libro> getLibro(Long id);
    void guardarOActualizarLibro(Libro Libro);
    void eliminarLibro(Long id);

}
