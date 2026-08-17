package dev.LagosN;

import java.util.ArrayList;

public class Prestamo {
    private String estudiante;
    private int fechaInicio;
    private int fechaTermino;
    private int run;
    private ArrayList<String> listaPrestamos;

    public Prestamo(){
        this.estudiante = "";
        this.fechaInicio = 0;
        this.fechaTermino = 0;
        this.run =0;

    }
    public Prestamo(String estudiante, int fechaInicio, int fechaTermino, int run){
        this.estudiante = estudiante;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.run = run;
        this.listaPrestamos = new ArrayList <>();
    }

    public boolean prestar(String prestar){
        return true;

    }

}
