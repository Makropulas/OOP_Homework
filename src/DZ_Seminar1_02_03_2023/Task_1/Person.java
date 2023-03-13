package DZ_Seminar1_02_03_2023.Task_1;

public class Person {

    private String sex;
    private String fullName;

    public Person(String fullName, String sex) {
        this.fullName = fullName;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSex() {
        return sex;
    }
}
