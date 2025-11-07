package com.example.demo.controler;

import com.example.demo.entity.Libro;
import com.example.demo.service.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class LibroController {
    @Autowired
    private LibroServiceImpl libroServiceImpl; //Se inyecta la dependencia


    @GetMapping
    public List<Libro> obtenerTodos(){
        return this.libroServiceImpl.getLibros();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibro(@PathVariable Long id){
        return this.libroServiceImpl.getLibro(id);
    }

    @PostMapping
    void guardarOACtualizarLibro(@RequestBody Libro libro){
        this.libroServiceImpl.guardarOActualizarLibro(libro);
    }

    @DeleteMapping
    void eliminarLibro(@PathVariable("libroid") Long libroid){
        this.libroServiceImpl.eliminarLibro(libroid);
    }
}
