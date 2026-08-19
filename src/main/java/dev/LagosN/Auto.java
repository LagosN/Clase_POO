package dev.LagosN;

public class Auto {
    private  String modelo;
    private String marca;
    private String color;
    private int anno;
    private double km;
    private String tipo;

    public  Auto(String modelo, double km, String marca,String color, int anno, String tipo){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.km = km;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String nuevoModelo){
        this.modelo = nuevoModelo;
    }
    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    public String getTipo(){
        return  tipo;
    }
    public int getAnno(){
        return anno;
    }
    public double getKm(){
        return km;
    }
    public void avanzar(double distancia){
     km = km + distancia;
     System.out.println("Avanzando:" + distancia + "km. Km totales :" + km);
    }
    public void retroceder(double distancia){
        km = km - distancia;
        System.out.println("Retrocediendo: " + distancia + "km. Km totales: " + km);
    }
}

