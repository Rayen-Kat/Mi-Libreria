package com.martinez.mi_libreria;

import java.util.Locale;

public class Libros {

    String titulo;
    String autor;
    String categoria;
    String leido;
    String calificacion;

    public Libros(String titulo, String autor, String categoria, String leido, String calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.leido = leido;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getLeido() {
        return leido;
    }

    public void setLeido(String leido) {
        this.leido = leido;
    }
}
