public abstract class Human implements Action, Emotion {
    private String name, role;
    private int age;
    private Gender gender;

    public Human(String name, String role, int age, Gender gender) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "Имя: '" + name + '\'' +
                ", Роль: '" + role + '\'' +
                ", Возраст: " + age +
                ", Пол: " + gender +
                '}';
    }
}
