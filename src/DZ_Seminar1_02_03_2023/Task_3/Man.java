package DZ_Seminar1_02_03_2023.Task_3;

public class Man {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    public Man() {
        this("Человек");
    }

    public String getName() {
        return name;
    }

    public void callingCat(Cat cat) {
        System.out.println("Кис-кис, " + cat.getName() + " иди сюда!");
        cat.runToOwner();
    }

    public void petTheCat(Cat cat) {
        System.out.println(name + " гладит питомца по имени " + cat.getName());
        cat.emotion();
    }
}
