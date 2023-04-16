import java.util.ArrayList;

public class Research {
    static ArrayList<String> result = new ArrayList<>();

    public static ArrayList<String> abilityToVoice(Pets pets) {
        for (Animal pet : pets.animals) {
            if (Voice.class.isAssignableFrom(pet.getClass())) {
                result.add(pet.getName());
            }
        }
        return result;
    }
}
