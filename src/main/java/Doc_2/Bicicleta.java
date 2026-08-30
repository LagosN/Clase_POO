package Doc_2;

public class Bicicleta extends Vehiculo implements LuzEmergencia {
    private String color;
    private String tipoRueda;
    private int peso;
    private int anno;

    public Bicicleta(String color, String tipoRueda, int peso, int anno,String marca, String modelo, int velocidadMaxima){
        super(marca, modelo, velocidadMaxima);
        this.color = color;
        this.tipoRueda = tipoRueda;
        this.peso= peso;
        this.anno = anno;
    }
    public void setColor(String nuevoColor){this.color = nuevoColor;}
    public String getColor(){return color;}

    public void setTipoRueda(String nuevotipoRueda){this.tipoRueda = nuevotipoRueda;}
    public String getTipoRueda(){return tipoRueda;}

    public void setPeso(int nuevoPeso){this.peso = nuevoPeso;}
    public int getPeso(){return peso;}

    public void setAnno(int nuevoAnno){this.anno = nuevoAnno;}
    public int getAnno(){return  anno;}

    public void tocarCampana(){
        System.out.println("Ring Ring");
    }
    @Override
    public void desplazarse() {

    }


    @Override
    public void prenderLuz() {

    }
}
