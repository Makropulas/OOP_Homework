import PrintMethods.*;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Мэйси", "Шотландская", "Жемчужный", Gender.female,
                Randomizer.getRandom(2), Randomizer.getRandom(2));
        Animal dog = new Dog("Рэй", "Боксёр", "Коричневый", Gender.male,
                Randomizer.getRandom(5), Randomizer.getRandom(30));
        Animal fish = new Fish("Гарри", "Склярия", "Полосатый", Gender.male, 0.5, 0.2);
        Human owner = new Owner("Павел", "Хозяин", Randomizer.getRandom(20), Gender.male);
        Human doctor = new Doctor("Татьяна", "Ветеринар", Randomizer.getRandom(25), Gender.female);
        Pets pets = new Pets(cat, dog, fish);

        PrintObjects.print(cat, dog, fish, owner, doctor);
        PrintDelimiter.print();

        owner.action(pets);
        PrintDelimiter.print();
        doctor.action(pets);
        PrintDelimiter.print();

        System.out.println("Питомцы, способные издавать голос: " + Research.abilityToVoice(pets));
    }
}
