public class Cat extends Animal {
    public Cat(String name, String type, String color, Gender gender, int age, int weight) {
        super(name, type, color, gender, age, weight);
    }

    @Override
    public String voice() {
        return "Mяу, Мяу!";
    }

    @Override
    public void emotion() {
        int num = Randomizer.getRandom(0);
        String emotion = num % 2 == 0 ? " мяукает " + voice() : " нервничает и пытается сбежать";
        System.out.println(getName() + emotion);
    }
}
