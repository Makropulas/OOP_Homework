package Task_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        People people = new People("Сергей");
        Closet closet = new Closet("Шкафчик");
        Room<Furniture> room = new Room<>(new Closet("Сервант"), new Table("Стол-книжка"));

        people.close(closet);
        people.open(closet);
        people.open(closet);
        people.close(closet);

        System.out.println(">>>>>>>");
        System.out.println("В комнате дополнительно имеется эта мебель: " + room);
    }
}
