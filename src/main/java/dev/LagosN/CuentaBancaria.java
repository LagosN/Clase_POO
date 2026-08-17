package dev.LagosN;

public class CuentaBancaria {
    private String nombre;
    private int run;
    private int numeroCuenta;
    private int saldo;

    public CuentaBancaria(){
        this.nombre = "";
        this.run = 0;
        this.numeroCuenta = 0;
        this.saldo = 0;
    }
    public CuentaBancaria(String nombre, int run, int numeroCuenta, int saldo){
        this.nombre = nombre;
        this.run = run;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;

    }
    public int getSaldo(){
        return saldo;
    }

    public int depositarDinero(int saldo, int numeroCuenta, int deposito){
        int nuevoSaldo = saldo + deposito;
        return nuevoSaldo;
    }
    public int girarFondos(CuentaBancaria){
        return true;
    }
}
