package dev.LagosN;

public class Prestamo {
    private String estudiante;
    private int fechaInicio;
    private int fechaTermino;
    private String nombreLibro;

    public Prestamo(){
        this.estudiante = "";
        this.fechaInicio = 0;
        this.fechaTermino = 0;
        this.nombreLibro ="";

    }
    public Prestamo(String estudiante, int fechaInicio, int fechaTermino, String nombreLibro){
        this.estudiante = estudiante;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.nombreLibro =nombreLibro;

    }
    public boolean devolver(int fechaTermino,String estudiante ){
        return true;
    }
    public boolean prestar(String prestar){
        return true;

    }
    public boolean disponible(String disponible){

    }
}
