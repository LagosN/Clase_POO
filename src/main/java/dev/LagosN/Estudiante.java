package dev.LagosN;

///
public class Estudiante {
    private String nombre;
    private int curso;
    private float promedio;
    private int alumnosCurso;

    public Estudiante(){
        String nombre = "";
        int curso = 0;
        float promedio = 0;
        int alumnosCurso = 0;

    }
    public Estudiante(String nombre, int curso, float promedio, int alumnosCurso){
        String nombre = nombre;
        int curso = curso;
        float promedio = promedio;
        int alumnosCurso = alumnosCurso;

    }
    public boolean notas(int promedio, int alumnosCurso){
        float notas = (float) promedio/ alumnosCurso;
    }
}
