package Doc_3;

public class TrenP extends Transportes implements  Publicidad{
    private String nombreConductor;
    private int horasUSo;


    public TrenP(String nombreConductor, int horasUSo, String nombre, int cantidadPasajeros, boolean licencia){
        super(nombre, cantidadPasajeros, licencia);
        this.nombreConductor = nombreConductor;
        this.horasUSo = horasUSo;
        this.nombre = nombre;
        this.cantidadPasajeros = cantidadPasajeros;
        this.licencia = licencia;
    }
    public void setNombreConductor( String nuevoNombreConductor){
        this.nombreConductor = nuevoNombreConductor;
    }
    public String getNombreConductor(){
        return nombreConductor;
    }

    public void setHorasUSo(int nuevaHorasUso){
        this.horasUSo = nuevaHorasUso;
    }
    public int getHorasUSo(){
        return horasUSo;
    }
    @Override
    public int PagoPorTiempo() {
        return 0;
    }

    @Override
    public boolean puedeTener() {
        return false;
    }
}
