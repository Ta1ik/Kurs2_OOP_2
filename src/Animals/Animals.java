package Animals;

import java.util.Objects;

public abstract class Animals {
    private final String name;
    private int age;
    private String livingArea;

    public Animals(String name, int age, String livingArea) {
        this.name = validateString(name);
        this.age = validateAge(age);
        this.livingArea = validateString(livingArea);
    }
    public String validateString(String value){
        return value == null || value.isEmpty() || value.isBlank() ? "default" : value;
    }
    public int validateAge (int value) {
        return value <= 0 ? 1 : Math.abs(value);
    }
    public int validateSpeed(int value){
        return value <= 0 ? 5 : Math.abs(value);
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void go();
    public void hunt(){
    }
    public void walk(){
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getLivingArea() {
        return livingArea;
    }

    public void setAge(int age) {
        this.age = validateAge(age);
    }
    public void setLivingArea(String livingArea) {
        this.livingArea = validateString(livingArea);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name) && livingArea.equals(animals.livingArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, livingArea);
    }
}
