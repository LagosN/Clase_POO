package Doc_3;

public  class CarroElectrico extends  Transportes implements Publicidad {
    private String modelo;
    private String id;

    public CarroElectrico(String modelo, String id, String nombre, int cantidadPasajeros, boolean licencia){
        super(nombre, cantidadPasajeros,  licencia);
        this.modelo = modelo;
        this.id = id;
        this.nombre = nombre;
        this.cantidadPasajeros = cantidadPasajeros;
        this.licencia = licencia;


    }

    public String getModelo(){
        return  modelo;
    }
    public void setModelo( String nuevoModelo){
        this.modelo = nuevoModelo;

    }
    public String getId(){
        return  id;

    }
    public void setId(String nuevaID){
        this.id = nuevaID;
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
