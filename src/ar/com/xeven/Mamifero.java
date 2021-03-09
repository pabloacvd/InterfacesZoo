package ar.com.xeven;

public class Mamifero extends Animal implements IAnimal{

    private boolean vacunado;

    public Mamifero(int id, String nombre, boolean vacunado) {
        super(id, nombre);
        this.vacunado = vacunado;
    }

    @Override
    public String verDatos() {
        String vacunas = (vacunado)?" (vacunado)":" (sin vacunas)";
        return id+": "+nombre+vacunas;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
}
