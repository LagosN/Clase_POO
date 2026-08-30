package Doc_3;

public abstract class Transportes {
    protected String nombre;
    protected int cantidadPasajeros;
    protected boolean licencia;


    public Transportes(String nombre, int cantidadPasajeros, boolean licencia){
        this.nombre = nombre;
        this.cantidadPasajeros = cantidadPasajeros;
        this.licencia = licencia;
    }

    protected String getNombre(){
        return nombre;
    }
    protected void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    private int getCantidadPasajeros(){
        return  cantidadPasajeros;
    }
    private void setCantidadPasajeros(int nuevaCantidadDePasajeros){
        this.cantidadPasajeros = nuevaCantidadDePasajeros;
    }
    private boolean getLicencia(){
        return  licencia;
    }
    private void setLicencia(boolean nuevaLicencia){
        this.licencia = nuevaLicencia;

    }
    public abstract int PagoPorTiempo();
}
