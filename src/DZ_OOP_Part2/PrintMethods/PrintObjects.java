package PrintMethods;

public class PrintObjects {
    public static void print(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }
}
