package dev.LagosN;

public class VehiculoEmpresa {

    private String empresa;
    private String nombreConductor;
    private Auto vehiculo;
    private int totalEmpresa;

    public VehiculoEmpresa(String empresa, String nombreConductor, Auto vehiculo, int totalEmpresa) {
        this.empresa = empresa;
        this.nombreConductor = nombreConductor;
        this.totalEmpresa = totalEmpresa;
        this.vehiculo = vehiculo;

    }

    public Auto getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Auto vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public String getEmpresa() {
        return empresa;
    }
    public int getTotalEmpresa(){
        return  totalEmpresa;
    }
    public void setNombreConductor(String nuevoNombreConductor){
        this.nombreConductor = nuevoNombreConductor;
    }
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }



}


