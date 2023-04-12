import java.util.Random;

public class Randomizer {
    public static Random random = new Random();

    public static int getRandom(Number x) {
        return Math.abs(random.nextInt(x.intValue(), x.intValue() + 10));
    }
}
