package Task_2;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        Closet closet = new Closet();
        closet.isDoor();
        people.close(closet);
        people.open(closet);
        people.open(closet);
        people.close(closet);
    }
}
