package Task_3;

public abstract class Human extends Animal{
    private String surname;
    public Human(String name, String surname) {
        super(name);
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
