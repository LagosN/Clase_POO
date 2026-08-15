package dev.LagosN;

public class CuentaBancaria {
    private String nombre;
    private int run;
    private int numeroCuenta;
    private String tipoCuenta;

    public CuentaBancaria(){
        this.nombre = "";
        this.run = 0;
        this.numeroCuenta = 0;
        this.tipoCuenta = "";
    }
    public CuentaBancaria(String nombre, int run, int numeroCuenta, String tipoCuenta){
        this.nombre = nombre;
        this.run = run;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;

    }
    public boolean consultarSaldo(int consultarSaldo){
        return true;
    }
    public boolean depositarDinero(int depositarDinero){
        return true;
    }
    public boolean girarFondos(int girarFondos){
        return true;
    }
}
