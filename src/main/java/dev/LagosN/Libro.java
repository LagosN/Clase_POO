package dev.LagosN;

public class Libro {
    private String titulo;
    private int anno;
    private String autor;
    private int id;

    public Libro(){
        this.titulo = "Sin definir";
        this.anno = 0;
        this.autor = "Anonimo";
        this.id = 0;


    }
    public Libro(String titulo, int anno, String autor, int id){
        this.titulo = titulo;
        this.anno = anno;
        this.autor = autor;
        this.id = id ;
    }

    public boolean prestamo(String prestamo){
        return true;

    }
    public boolean disponibilidad(){
        return true;
    }
    public void devolver(String fechaDevolucion){

    }
}
