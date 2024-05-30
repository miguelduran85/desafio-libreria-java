package com.aluracursos.desafio_libreria.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;
    @Column(unique = true)
    private String titulo;
    private  String Idioma;
    private  Integer numeroDescargas;
    @ManyToMany
    private Autor autor;

    @Override
    public String toString() {
        return "Libro{" +
                ", titulo= '" + titulo + '\'' +
                ", autor= " + autor.getNombre() +
                ", Idioma= '" + Idioma + '\'' +
                ", numeroDescargas= " + numeroDescargas;
    }

    public Libro(){
    }
    // getters&setters
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String idioma) {
        Idioma = idioma;
    }

    public Integer getNumeroDescargas() {
        return numeroDescargas;
    }

    public void setNumeroDescargas(Integer numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
