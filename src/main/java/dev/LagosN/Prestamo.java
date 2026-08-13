package dev.LagosN;

public class Prestamo {
    private int estudiante;
    private int fechaInicio;
    private int fechaTermino;
    private int librosPrestados;

    public Prestamo(){
        this.estudiante = 0;
        this.fechaInicio = 0;
        this.fechaTermino = 0;
        this.librosPrestados =0;

    }
    public Prestamo(int estudiante, int fechaInicio, int fechaTermino, int librosPrestados){
        this.estudiante = estudiante;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.librosPrestados =librosPrestados;

    }
    public boolean devolver(String devolver){
        return true;
    }
    public boolean prestar(String prestar){
        return true;

    }
    public boolean disponible(String disponible){

    }
}
