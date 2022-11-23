package Animals;

public class Predators extends Mammals{
    public Predators(String name, int age, String livingArea, int speed, String typeFood) {
        super(name, age, livingArea, speed, typeFood);
    }

    @Override
    public void hunt() {
        System.out.println(Predators.class.getSimpleName() + " " +getName() + " охотится.");
    }


    public String toString() {
        return String.format("Класс: %s, %s. Имя: %s, возраст %d лет, ареал обитания: %s, скорость передвижения %d км/ч, тип питания: %s .",
                Mammals.class.getSimpleName(),Predators.class.getSimpleName() , getName(),getAge(),getLivingArea(),getSpeed(), getTypeFood());
    }
}
