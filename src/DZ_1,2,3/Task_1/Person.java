package Task_1;

public class Person implements Comparable<Person> {

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

    @Override
    public int compareTo(Person o) {
        return this.fullName.compareTo(o.fullName);
    }
}
