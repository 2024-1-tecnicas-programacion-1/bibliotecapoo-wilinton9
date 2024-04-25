package com.mycompany.bibliotecapoo;

public class Libro {
    // TODO: Aquí va tu código
    
    private String titulo;
    private String autor;
    private int annoPublicacion;
    private String genero;
    private boolean leido;

    public Libro(String titulo, String autor, int annopublicacion, String genero, boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.annoPublicacion = annopublicacion;
        this.genero = genero;
        this.leido = leido;
    }
    
     public String mostrarInfor(){
     return "Titulo:" + titulo + "Autor:" + autor + "Año de publicaion:" + annoPublicacion + "Genero:" + genero;
            
     }
     public void marcarleido(){
         leido = true;
     }
     public boolean esleido(){
         return leido;
     }
     public boolean esAntiguo() {
        if (annoPublicacion <1974){
        return true;
        }else {
        return false;    
        }
      }
    }
}
