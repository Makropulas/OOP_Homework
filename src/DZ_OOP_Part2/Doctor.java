public class Doctor extends Human {
    public Doctor(String name, String role, int age, Gender gender) {
        super(name, role, age, gender);
    }

    @Override
    public void action(Pets pets) {
        if (pets.animals.size() < 1) System.out.println(getName() + " отдыхает");
        else {
            int num = Randomizer.getRandom(0);
            for (Animal animal : pets.animals) {
                String action = num % 2 == 0 ? " лечит " : " осматривает ";
                System.out.println(getName() + action + "животное по имени " + animal.getName());
                animal.emotion();
                this.emotion();
                System.out.println();
            }
        }
    }

    @Override
    public void emotion() {
        int num = Randomizer.getRandom(0);
        String emotion = num % 2 == 0 ? " сосредоточенно делает своё дело" : " гладит животное";
        System.out.println(getName() + emotion);
    }
}
