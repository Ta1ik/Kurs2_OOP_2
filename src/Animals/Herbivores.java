package Animals;

public class Herbivores extends Mammals {
    public Herbivores(String name, int age, String livingArea, int speed, String typeFood) {
        super(name, age, livingArea, speed, typeFood);
    }

    public void graze(){
        System.out.println(Herbivores.class.getSimpleName() + " " +getName() + " пасется.");
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, %s. Имя: %s, возраст %d лет, ареал обитания: %s, скорость передвижения %d км/ч, тип питания: %s .",
                Mammals.class.getSimpleName(),Herbivores.class.getSimpleName() , getName(),getAge(),getLivingArea(),getSpeed(), getTypeFood());
    }
}
