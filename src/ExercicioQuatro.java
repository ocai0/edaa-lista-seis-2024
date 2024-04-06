import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ExercicioQuatro {
    public static void resolve() {
        List<Country> listaPaises = new ArrayList<Country>();
        listaPaises.add(new Country("Brasil"));
        listaPaises.add(new Country("Argentina"));
        listaPaises.add(new Country("Chile"));
        listaPaises.add(new Country("Uruguai"));
        listaPaises.add(new Country("Portugal"));
        listaPaises.add(new Country("Bolívia"));
        listaPaises.add(new Country("China"));
        listaPaises.add(new Country("Estados Unidos"));
        listaPaises.add(new Country("França"));
        listaPaises.add(new Country("Japão"));
        listaPaises.add(new Country("Coréia"));

        Collections.sort(listaPaises, (Country a, Country b) -> a.getName().compareTo(b.getName()));
        listaPaises.forEach(Country -> System.out.println(Country.getName()));
    }
}