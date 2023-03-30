package Task_2;

public class People {
    private String name;

    public People(String name) {
        this.name = name;
    }

    public People() {
        this("Человек");
    }

    public String getName() {
        return name;
    }

    public void open(Closet closet) {
        closet.openDoor(getName());
    }

    public void close(Closet closet) {
        closet.closeDoor(getName());
    }
}
