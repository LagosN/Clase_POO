package Doc_2;

public class Moto extends Vehiculo implements TocableBocina, LuzEmergencia
{
    private boolean tieneParabrisas;

    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void tocarBocina() {

    }

    @Override
    public void desplazarse() {

    }

    @Override
    public void prenderLuz() {

    }
}