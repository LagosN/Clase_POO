package dev.LagosN;

///
public class Estudiante {
    private String nombre;
    private int curso;
    private float promedio;
    private float inasistencias;

    public Estudiante(){
        String nombre = "";
        int curso = 0;
        float promedio = 0;
        float inasistencias = 0;

    }
    public Estudiante(String nombre, int curso, float promedio, float inasistencias){
        String nombre = nombre;
        int curso = curso;
        float promedio = promedio;
        float inasistencias = inasistencias;

    }
    public boolean notas(int promedio){
        float notas = (float) promedio/30;
    }
}
