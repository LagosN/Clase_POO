package dev.LagosN;

///
public class Estudiante {
    private String nombre;
    private int curso;
    private float promedio;
    private int alumnosCurso;

    public Estudiante(){
        this.nombre = "";
        this.curso = 0;
        this.promedio = 0;
        this.alumnosCurso = 0;

    }
    public Estudiante(String nombre, int curso, float promedio, int alumnosCurso){
        this.nombre = nombre;
        this.curso = curso;
        this.promedio = promedio;
        this.alumnosCurso = alumnosCurso;

    }
    public boolean notas(int promedio, int alumnosCurso){
        float notas = (float) promedio/ alumnosCurso;

    }
}
