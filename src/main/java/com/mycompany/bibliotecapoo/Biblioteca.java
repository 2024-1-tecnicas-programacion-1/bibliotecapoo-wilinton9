package com.mycompany.bibliotecapoo;
import java.util.LinkedList;

public class Biblioteca {
    // Atributos
    private LinkedList<Libro> biblioteca;

    // Constructor
    public Biblioteca() {
        biblioteca = new LinkedList<>();
    }

    // Método para registrar un libro
    public void registrarLibro(Libro nuevoLibro) {
        biblioteca.add(nuevoLibro);
    }

    // Método para buscar un libro por título o autor
    public Libro buscarLibro(String palabraBusqueda) {
        System.out.println("Resultados de búsqueda para: " + palabraBusqueda);
        for (Libro libro : biblioteca) {
            if (libro.getTitulo().equalsIgnoreCase(palabraBusqueda) || libro.getAutor().equalsIgnoreCase(palabraBusqueda)) {
                return libro;
            }
        }
        return null;
    }

    // Método para mostrar todos los libros disponibles
    public void mostrarLibros() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : biblioteca) {
            System.out.println(libro.mostrarInfo());
        }
    }

    // Método para mostrar los libros que no hemos leído
    public void mostrarLibrosNoLeidos() {
        System.out.println("Libros que no hemos leído:");
        for (Libro libro : biblioteca) {
            if (!libro.getLeido()) {
                System.out.println(libro.mostrarInfo());
            }
        }
    }
}


