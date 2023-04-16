import java.util.ArrayList;
import java.util.List;

public class Pets {
    List<Animal> animals = new ArrayList<>();

    public Pets(Animal... animals) {
        this.animals = List.of(animals);
    }

    public Pets() {
    }

    public void add(Animal animal) {
        animals.add(animal);
    }

    @Override
    public String toString() {
        ArrayList<String> pets = new ArrayList<>();
        for (Animal animal : animals) {
            pets.add(animal.getName());
        }
        return pets.toString();
    }
}
