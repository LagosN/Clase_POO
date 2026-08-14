package dev.LagosN;

public class Producto {
    private String nombre;
    private int cantidad;
    private int precio;
    private int id;

    public Producto(){
        this.nombre="";
        this.cantidad=0;
        this.precio = 0;
        this.id= 0;
    }

    public Producto(String nombre, int cantidad, int precio, int id){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id = id ;


    }
    public boolean vender(int vender){
        return true;
    }

    public boolean devolver(int devolver){
        return true;
    }
    public boolean disponible(String disponible){
        return true;
    }
}

