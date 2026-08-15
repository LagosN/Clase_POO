package dev.LagosN;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private int anno;
    private String autor;
    private int run;

    public Libro(){
        this.titulo = "Sin definir";
        this.anno = 0;
        this.autor = "Anonimo";
        this.run = 0;


    }
    public Libro(String titulo, int anno, String autor, int run){
        this.titulo = titulo;
        this.anno = anno;
        this.autor = autor;
        this.run = run ;
    }

    public boolean prestamo(int run, String titulo){

       ArrayList<String> lista= new ArrayList<>() ;
       lista.add(titulo);
       lista.add(run);

    }
    public boolean disponibilidad(){
        return true;
    }
    public void devolver(String fechaDevolucion){

     }
}
