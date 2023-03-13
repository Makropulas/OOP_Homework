package DZ_Seminar1_02_03_2023.Task_2;

public class Closet {
    private boolean door;
    private String name;

    public Closet(String name) {
        this.name = name;
    }

    public Closet() {
        this("Шкаф");
    }

    public void openDoor(String peopleName) {
        if(door) System.out.println(peopleName + " не смог открыть открытую дверь!");
        else {
            door = true;
            System.out.println(peopleName + " открыл дверь");
        }
    }

    public void closeDoor(String peopleName) {
        if(!door) System.out.println(peopleName + " не смог закрыть закрытую дверь!");
        else {
            door = false;
            System.out.println(peopleName + " закрыл дверь");
        }
    }

    public void isDoor() {
        if(door) System.out.println(name + ". Дверь открыта");
        else System.out.println(name + ". Дверь закрыта");
    }
}
