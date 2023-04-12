package Task_3;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Сергей", "Сергеев");
        Cat cat = new Cat("Мэйси");
        Cat kitty = new Cat("Пончик");

        Nursery<Animal> nursery = new Nursery<>();
        nursery.add(cat);
        nursery.add(kitty);
        System.out.println("В питомнике содержатся животные: " + nursery);
        System.out.println(">>>>>");

        man.callingCat(cat);
        man.callingCat(kitty);
        System.out.println("-----");
        man.petTheCat(cat);
        man.petTheCat(kitty);
    }
}
