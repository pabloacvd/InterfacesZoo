package ar.com.xeven;

import java.util.LinkedList;
import java.util.List;

public class Refugio {

    private List<IAnimal> animales = new LinkedList<>();

    public Refugio() {
    }

    public Refugio(List<IAnimal> animales) {
        this.animales = animales;
    }

    // TODO borrar: método de prueba
    public void agregarMuchosAnimales(){
        agregarAnimal(new Mamifero(1, "buggie",true));
        agregarAnimal(new Reptil(2, "manuelita",100));
        agregarAnimal(new Mamifero(3,"felix",false));
        agregarAnimal(new Reptil(4,"max",40));
        agregarAnimal(new Reptil(5,"margarito",34));
    }

    public IAnimal getAnimalPorNombre(String nombre){
        for(IAnimal animal: animales){
            if(animal.getNombre().equals(nombre)){
                return animal;
            }
        }
        return null;
    }

    public void agregarAnimal(IAnimal animal){
        animales.add(animal);
    }

    public void listarAnimales(){
        for(IAnimal animal: animales)
            System.out.println(animal.verDatos());
    }
}
