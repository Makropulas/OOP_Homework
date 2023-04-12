import java.util.ArrayList;
import java.util.List;

public class Pets<T extends Animal> {
    List<T> animals = new ArrayList<>();

    @SafeVarargs
    public Pets(T... animals) {
        this.animals = List.of(animals);
    }

    public Pets() {
    }

    public void add(T animal) {
        animals.add(animal);
    }

    @Override
    public String toString() {
        ArrayList<String> pets = new ArrayList<>();
        for (T animal : animals) {
            pets.add(animal.getName());
        }
        return pets.toString();
    }
}
