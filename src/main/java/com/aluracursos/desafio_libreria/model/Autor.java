package com.aluracursos.desafio_libreria.model;

import jakarta.persistence.*;

@Entity

@Table(name= "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String nombre;
    private  Integer anhoDeNacimiento;
    private  Integer anhoDeMuerte;
    @ManyToMany
    private Libro libro;

    public Autor(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnhoDeNacimiento() {
        return anhoDeNacimiento;
    }

    public void setAnhoDeNacimiento(Integer anhoDeNacimiento) {
        this.anhoDeNacimiento = anhoDeNacimiento;
    }

    public Integer getAnhoDeMuerte() {
        return anhoDeMuerte;
    }

    public void setAnhoDeMuerte(Integer anhoDeMuerte) {
        this.anhoDeMuerte = anhoDeMuerte;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
