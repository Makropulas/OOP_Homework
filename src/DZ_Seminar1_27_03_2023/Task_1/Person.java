package DZ_Seminar1_27_03_2023.Task_1;

public class Person {

    private String fullName;
    private Sex sex;


    public Person(String fullName, Sex sex) {
        this.fullName = fullName;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public Sex getSex() {
        return sex;
    }
}
