public class Owner extends Human {
    public Owner(String name, String role, int age, Gender gender) {
        super(name, role, age, gender);
    }

    @Override
    public void action(Pets pets) {
        if (pets.animals.size() < 1) System.out.println(getName() + " грустит. У него нет питомца");
        else {
            if (pets.animals.size() == 1) System.out.println(getName() + " везёт в клинику своего питомца по имени " + pets);
            else {
                System.out.println(getName() + " везёт в клинику своих питомцев " + pets);
            }
            for (Animal pet : pets.animals) {
                pet.emotion();
            }
            this.emotion();
        }
    }

    @Override
    public void emotion() {
        int num = Randomizer.getRandom(0);
        String emotion = num % 2 == 0 ? " улыбается" : " задумчиво молчит";
        System.out.println(getName() + emotion);
    }
}
