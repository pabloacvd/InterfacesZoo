package ar.com.xeven;

public class Reptil extends Animal implements IAnimal{

    private int edadEstimada;

    public Reptil(int id, String nombre, int edadEstimada) {
        super(id, nombre);
        this.edadEstimada = edadEstimada;
    }

    @Override
    public String verDatos() {
        return id+": "+nombre+" - edad estimada: "+edadEstimada;
    }

    public int getEdadEstimada() {
        return edadEstimada;
    }

    public void setEdadEstimada(int edadEstimada) {
        this.edadEstimada = edadEstimada;
    }
}
