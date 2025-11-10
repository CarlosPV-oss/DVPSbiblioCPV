package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

//Evita definir getters y seters
@Data
@Entity
@NoArgsConstructor
@Table(name = "Libro")

public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //se generara de forma automatica
    //auto para autoincrementar

    private long id;
    @Column(nullable = false,columnDefinition = "") //Al ponerlo a posterior, hay que modificar la propiedad
    private String titulo;


    @Column
    private String autor;

}
