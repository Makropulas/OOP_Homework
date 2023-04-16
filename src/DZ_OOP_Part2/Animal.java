public abstract class Animal implements Emotion {

    private String name, type, color;
    private Number age, weight;
    private Gender gender;


    public Animal(String name, String type, String color, Gender gender, Number age, Number weight) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Gender getGender() {
        return gender;
    }

    public Number getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Number getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "Кличка: '" + name + '\'' +
                ", Порода: '" + type + '\'' +
                ", Окрас: '" + color + '\'' +
                ", Пол: " + gender +
                ", Возраст: " + age +
                ", Вес: " + weight +
                '}';
    }
}
