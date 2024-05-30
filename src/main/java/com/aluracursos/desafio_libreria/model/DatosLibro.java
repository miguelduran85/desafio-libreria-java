package com.aluracursos.desafio_libreria.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DatosLibro(
        @JsonAlias("title") String titulo,
        @JsonAlias("languages") String Idioma,
        @JsonAlias("download_count") Integer numeroDescargas
) {
}
