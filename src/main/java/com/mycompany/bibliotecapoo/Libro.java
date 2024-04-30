package com.mycompany.bibliotecapoo;
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int annoPublicacion;
    private String genero;
    private boolean leido;

    // Constructor
    public Libro(String titulo, String autor, int annoPublicacion, String genero, boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.annoPublicacion = annoPublicacion;
        this.genero = genero;
        this.leido = leido;
    }
    
    // Métodos
    // Método para mostrar la información del libro
    public String mostrarInfo() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año de publicación: " + annoPublicacion + ", Genero: " + genero;
    }
    
    // Método para marcar el libro como leído
    public void marcarLeido() {
        leido = true;
    }

    // Método para verificar si el libro es antiguo
    public boolean esAntiguo() {
        int diferencia = 2024 - annoPublicacion;
        return diferencia >= 50;
    }

    // Getters y Setters
    public boolean getLeido() {
        return leido;
    }

    public String getTitulo() {
        return titulo;
    }
}
