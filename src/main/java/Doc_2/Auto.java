package Doc_2;

public class Auto extends Vehiculo implements TocableBocina {
    private String color;
    private int cantidadPuertas;

    public Auto(String marca, String modelo,int velocidadMaxima,String color, int cantidadPuertas){
        super(marca, modelo, velocidadMaxima);
        this.color = color;
        this.cantidadPuertas = cantidadPuertas;}


    public String getColor(){
        return color;
    }
    public int getCantidadPuertas(){
        return cantidadPuertas;
    }

    public void setColor(String nuevoColor){
        this.color = nuevoColor;
    }
    public void setCantidadPuertas(int nuevaCantidadPuertas){
        this.cantidadPuertas = nuevaCantidadPuertas;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return  modelo;
    }
    @Override
    public void tocarBocina() {

    }

    @Override
    public void desplazarse() {

    }
}


