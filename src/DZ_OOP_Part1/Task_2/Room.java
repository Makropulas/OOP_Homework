package Task_2;

import java.util.Arrays;

public class Room<T extends Furniture>{
    private T[] furniture;

    public Room(T... furniture) {
        this.furniture = furniture;
    }

    @Override
    public String toString() {
        return Arrays.toString(furniture);
    }
}
