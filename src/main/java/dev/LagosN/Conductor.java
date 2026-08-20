package dev.LagosN;

public class Conductor {
    private String nombre;
    private int run;
    private int vehiculosGuardados;
    private Auto vehiculo;

    public Conductor(String nombre, int run, int vehiculosGuardados, Auto vehiculo) {
        this.nombre = nombre;
        this.run = run;
        this.vehiculosGuardados = vehiculosGuardados;
        this.vehiculo = vehiculo;

    }

    public Auto getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Auto vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRun() {
        return run;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public void setRun(int run){
        this.run = run;
    }

    public void setAgregarVehiculos(int agregarVehiculosGuardados){
        if(agregarVehiculosGuardados < 0 ){
            System.out.println("No puedes guardar un numero menor a 0");
        }else{
            this.vehiculosGuardados += agregarVehiculosGuardados;
        }
    }
    public void quitarVehiculos(int quitarVehiculosGuardados){
        if(quitarVehiculosGuardados < 0 ){
            System.out.println("No puedes guardar un numero menor a 0");
        }else{
            this.vehiculosGuardados -= quitarVehiculosGuardados;
        }
    }

}
