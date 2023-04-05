package Task_2;

public class Main {
    public static void main(String[] args) {
        People people = new People("Сергей");
        Closet closet = new Closet("Шкафчик");
        people.close(closet);
        people.open(closet);
        people.open(closet);
        people.close(closet);
    }
}
