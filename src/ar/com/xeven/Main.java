package ar.com.xeven;

public class Main {

    public static void main(String[] args) {

        Refugio refugio = new Refugio();
        //TODO prueba:
        refugio.agregarMuchosAnimales();

        refugio.listarAnimales();

        IAnimal unAnimal = refugio.getAnimalPorNombre("buggie");

        //if(unAnimal.getClass().getSimpleName().equals("Mamifero")){
        if(unAnimal instanceof Mamifero){
            System.out.println(unAnimal.getNombre()+" es un mamífero");
            Mamifero animalM = (Mamifero) unAnimal;
            String vacunas = (animalM.isVacunado())?"está vacunado!":"no está vacunado!";
            System.out.println(vacunas);
        }else if(unAnimal instanceof Reptil){
            System.out.println(unAnimal.getNombre()+" es un reptil");
            Reptil animalR = (Reptil) unAnimal;
            System.out.println("Y su edad es: "+animalR.getEdadEstimada());
        }else{
            System.out.println("ERROR!");
        }
    }
}
