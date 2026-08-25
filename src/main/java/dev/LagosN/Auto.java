
package dev.LagosN;
import java.util.ArrayList;
public class Auto {

    private  String modelo;
    private String marca;
    private String color;
    private int anno;
    private double km;
    private String tipo;
    private String patente;

    public  Auto(String modelo, double km, String marca,String color, int anno, String tipo, String patente){

        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.km = km;
        this.anno = anno;
        setModelo(modelo);
        this.patente = patente;

    }
    /*
    Getters y Setters
     */
    public void setPatente(String nuevaPatente){
        this.patente = nuevaPatente;

    }
    public String getPatente(){
        return  patente;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String nuevoModelo){
        if (nuevoModelo == null || nuevoModelo.trim().isEmpty()){
            System.out.println("Error; El modelo no puede quedar vacío. ");}
        else{


            this.modelo = nuevoModelo;}
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
    public void estadoUso(){
        if (this.km > 30000.0){
            System.out.println( "Vehiculo de uso prolongado");
        }
        else if (this.km > 10000.0){
            System.out.println( "Vehículo de uso medio");
        }else{
            System.out.println("Vehiculo de bajo uso");
        }


    }

    /*
    Métodos de acción
     */
    public void avanzar(double distancia){
        if (distancia > 0){


        this.km = this.km + distancia;
     System.out.println("Avanzando:" + distancia + "km. Km totales :" + km);}
    }
    public void retroceder(double distancia){
        if (distancia > 0){
        this.km = this.km - distancia;
        System.out.println("Retrocediendo: " + distancia + "km. Km totales: " + km);}
    }
}

