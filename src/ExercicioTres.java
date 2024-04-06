import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ExercicioTres {
    public static void resolve() {
        List<Animal> listaAnimais = new ArrayList<Animal>();
        listaAnimais.add(new Animal("Jacaré"));
        listaAnimais.add(new Animal("Leão"));
        listaAnimais.add(new Animal("Girafa"));
        listaAnimais.add(new Animal("Elefante"));
        listaAnimais.add(new Animal("Zebra"));
        listaAnimais.add(new Animal("Cachorro"));
        listaAnimais.add(new Animal("Gato"));
        listaAnimais.add(new Animal("Cobra"));
        listaAnimais.add(new Animal("Morcego"));

        Collections.sort(listaAnimais, (Animal a, Animal b) -> a.getName().compareTo(b.getName()));
        listaAnimais.forEach(animal -> System.out.println(animal.getName()));
    }
}