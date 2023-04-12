package Task_3;

import java.util.Random;

public class Man extends Human{
    Random random = new Random();
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
        System.out.println(getName() + " зовёт питомца: Кис-кис, " + cat.getName() + " иди сюда!");
        cat.runToOwner();
    }

    public void petTheCat(Cat cat) {
        System.out.println(getName() + " гладит питомца по имени " + cat.getName());
        cat.emotion();
        this.emotion();
    }

    @Override
    public void emotion() {
        int num = random.nextInt(3);
        String emotion;
        switch (num) {
            case 0 -> emotion = " улыбается";
            case 1 -> emotion = " смеётся";
            case 2 -> emotion = " ласково смотрит на питомца";
            default -> emotion = " ничего не делает";
        }
        System.out.println(getName() + emotion);
    }
}
