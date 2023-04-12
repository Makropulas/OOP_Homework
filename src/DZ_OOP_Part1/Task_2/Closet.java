package Task_2;

public class Closet extends Furniture implements IsDoor {
    private boolean door;

    public Closet(String name) {
        super(name);
    }

    public Closet() {
        this("Шкаф");
    }

    @Override
    public void openDoor(String peopleName) {
        if (door) System.out.println(peopleName + " хотел открыть дверь. Смотрит на " + getName() + ", а дверь уже открыта!");
        else {
            door = true;
            System.out.println(peopleName + " открывает " + getName() + ". " + isDoor());
        }
    }

    @Override
    public void closeDoor(String peopleName) {
        if (!door) System.out.println(peopleName + " хотел закрыть дверь. Смотрит на " + getName() + ", а дверь итак закрыта!");
        else {
            door = false;
            System.out.println(peopleName + " закрывает " + getName() + ". " + isDoor());
        }
    }

    @Override
    public String isDoor() {
        return door ? "Дверь открыта" : "Дверь закрыта" ;
    }
}
