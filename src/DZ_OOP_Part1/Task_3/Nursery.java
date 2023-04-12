package Task_3;

import java.util.ArrayList;
import java.util.List;

public class Nursery<T extends Animal> {
    List<T> animals;

    public Nursery() {
        this.animals = new ArrayList<>();
    }

    public void add(T animal) {
        animals.add(animal);
    }

    @Override
    public String toString() {
        return animals.toString();
    }
}
