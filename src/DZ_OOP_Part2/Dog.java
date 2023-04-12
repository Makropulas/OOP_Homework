public class Dog extends Animal {
    public Dog(String name, String type, String color, Gender gender, int age, int weight) {
        super(name, type, color, gender, age, weight);
    }

    @Override
    public String voice() {
        return "Гав, Гав!";
    }

    @Override
    public void emotion() {
        int num = Randomizer.getRandom(0);
        String emotion = num % 2 == 0 ? " лает " + voice() : " боится и трясётся";
        System.out.println(getName() + emotion);
    }
}
