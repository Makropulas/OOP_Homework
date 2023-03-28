package DZ_Seminar1_27_03_2023.Task_3;

public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        Cat cat = new Cat("Мэйси");
        Cat kitty = new Cat("Пончик");
        man.callingCat(cat);
        man.callingCat(kitty);
        System.out.println("-----");
        man.petTheCat(cat);
        man.petTheCat(kitty);
    }
}
