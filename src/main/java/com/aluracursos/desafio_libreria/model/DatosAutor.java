package com.aluracursos.desafio_libreria.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosAutor(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") Integer anhoDeNacimiento,
        @JsonAlias("death_year") Integer anhoDeMuerte
) {
}
