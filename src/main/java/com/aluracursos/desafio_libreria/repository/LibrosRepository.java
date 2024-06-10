package com.aluracursos.desafio_libreria.repository;

import com.aluracursos.desafio_libreria.model.Autor;
import com.aluracursos.desafio_libreria.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibrosRepository extends JpaRepository<Libro, Long> {

    Optional<Libro> findByTituloContainsIgnoreCase(String titulo);



}
