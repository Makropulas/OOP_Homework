package Task_2;

public abstract class Furniture {
    private String name;

    public Furniture(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
