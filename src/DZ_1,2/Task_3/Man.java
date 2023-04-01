package Task_3;

public class Man extends Human {
    public Man(String name, String surname) {
        super(name, surname);
    }

    public Man(String name) {
        this(name, "");
    }

    public Man() {
        this("Человек");
    }

    public void callingCat(Cat cat) {
        System.out.println("Кис-кис, " + cat.getName() + " иди сюда!");
        cat.runToOwner();
    }

    public void petTheCat(Cat cat) {
        System.out.println(getName() + " гладит питомца по имени " + cat.getName());
        cat.emotion();
    }
}
