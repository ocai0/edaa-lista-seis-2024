import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ExercicioCinco {
    public static void resolve() {
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("João", 25));
        listaPessoas.add(new Pessoa("Maria", 30));
        listaPessoas.add(new Pessoa("Pedro", 20));
        listaPessoas.add(new Pessoa("Ana", 22));
        listaPessoas.add(new Pessoa("Daniel", 31));
        listaPessoas.add(new Pessoa("Lucas", 18));

        Collections.sort(listaPessoas, (Pessoa a, Pessoa b) -> a.getAge() - b.getAge());
        listaPessoas.forEach(Pessoa -> System.out.println(Pessoa));
    }
}