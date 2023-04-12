package Task_3;

import java.util.Random;

public class Cat extends Animal{
    Random random = new Random();

    public Cat(String name) {
        super(name);
    }

    public void runToOwner() {
        System.out.println(random.nextBoolean() ? getName() + " бежит к хозяину" : "Игнорирует хозяина");

    }

    @Override
    public void emotion() {
        int num = random.nextInt(3);
        String emotion;
        switch (num) {
            case 0 -> emotion = " закрывает глаза и мурлычет";
            case 1 -> emotion = " пытается вырваться и убежать";
            case 2 -> emotion = " царапается и кусается";
            default -> emotion = " ничего не делает";
        }
        System.out.println(getName() + emotion);
    }
}
