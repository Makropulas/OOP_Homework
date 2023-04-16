public class Fish extends Animal{
    public Fish(String name, String type, String color, Gender gender, double age, double weight) {
        super(name, type, color, gender, age, weight);
    }

    @Override
    public void emotion() {
        int num = Randomizer.getRandom(0);
        String emotion = num % 2 == 0 ? " подплывает и заинтересованно смотрит" : " уплывает в дальний угол аквариума";
        System.out.println(getName() + emotion);
    }
}
