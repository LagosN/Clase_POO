package dev.LagosN;

public class CuentaBancaria {
    private String nombre;
    private int run;
    private int numeroCuenta;
    private String tipoCuenta;

    public CuentaBancaria(){
        String nombre = "";
        int run = 0;
        int numeroCuenta;
        String tipoCuenta;
    }
    public CuentaBancaria(String nombre, int run, int numeroCuenta, String tipoCuenta){
        String nombre = nombre;
        int run = run;
        int numeroCuenta = numeroCuenta;
        String tipoCuenta = tipoCuenta;

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
