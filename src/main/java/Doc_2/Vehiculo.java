package Doc_2;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }
    public abstract void desplazarse();
}

