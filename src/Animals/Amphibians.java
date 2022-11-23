package Animals;

public class Amphibians extends Animals{
    public Amphibians(String name, int age, String livingArea) {
        super(name, age, livingArea);
    }

    @Override
    public void eat() {
        System.out.println(Amphibians.class.getSimpleName() + " " +getName() + " кушает");
    }

    @Override
    public void sleep() {
        System.out.println(Amphibians.class.getSimpleName() + " " +getName() + " спит.");
    }

    @Override
    public void go() {
        System.out.println(Amphibians.class.getSimpleName() + " " +getName() +" идет.");
    }

    @Override
    public void hunt() {
        System.out.println(Amphibians.class.getSimpleName() + " " +getName() +" охотится.");
    }


    @Override
    public String toString() {
        return String.format("Класс: %s. Имя: %s, возраст %d лет, ареал обитания: %s.",Amphibians.class.getSimpleName(),getName(),getAge(),getLivingArea());
    }
}
