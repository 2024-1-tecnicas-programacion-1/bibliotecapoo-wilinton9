package com.mycompany.bibliotecapoo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca mibiblioteca = new Biblioteca();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1) Ingresar libro");
            System.out.println("2) Mostrar todos los libros");
            System.out.println("3) Buscar libro");
            System.out.println("4) Marcar libro como leído");
            System.out.println("5) Mostrar libros no leídos");
            System.out.println("0) Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    ingresarLibro(scanner, mibiblioteca);
                    break;
                case 2:
                    mibiblioteca.mostrarLibros();
                    break;
                case 3:
                    buscarLibro(scanner, mibiblioteca);
                    break;
                case 4:
                    marcarLibroLeido(scanner, mibiblioteca);
                    break;
                case 5:
                    mostrarLibrosNoLeidos(mibiblioteca);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void ingresarLibro(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Ingresar libro:");
        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el año de publicación: ");
        int annoPublicacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese el género: ");
        String genero = scanner.nextLine();

        Libro nuevoLibro = new Libro(titulo, autor, annoPublicacion, genero, false);
        biblioteca.registrarLibro(nuevoLibro);
        System.out.println("Libro registrado con éxito.");
    }

    private static void buscarLibro(Scanner scanner, Biblioteca biblioteca) {
        System.out.print("Ingrese el título o autor del libro a buscar: ");
        String palabraBusqueda = scanner.nextLine();
        Libro libroEncontrado = biblioteca.buscarLibro(palabraBusqueda);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println(libroEncontrado.mostrarInfor());
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private static void marcarLibroLeido(Scanner scanner, Biblioteca biblioteca) {
        System.out.print("Ingrese el título o autor del libro a marcar como leído: ");
        String palabraBusqueda = scanner.nextLine();
        Libro libroEncontrado = biblioteca.buscarLibro(palabraBusqueda);
        if (libroEncontrado != null) {
            libroEncontrado.marcarleido();
            System.out.println("Libro marcado como leído.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private static void mostrarLibrosNoLeidos(Biblioteca biblioteca) {
        System.out.println("Libros no leídos:");
        for (Libro libro : biblioteca.getLibros()) {
            if (!libro.getleido()) {
                System.out.println(libro.mostrarInfor());
            }
        }
    }
}



