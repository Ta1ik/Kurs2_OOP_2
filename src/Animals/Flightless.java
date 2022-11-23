package Animals;

public class Flightless extends Birds{
    public Flightless(String name, int age, String livingArea, String typeMove) {
        super(name, age, livingArea, typeMove);
    }

    @Override
    public void walk() {
        System.out.println(Flightless.class.getSimpleName() + " " +getName() + " гуляет.");
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, %s. Имя: %s, возраст %d лет, ареал обитания: %s.", Birds.class.getSimpleName(),Flightless.class.getSimpleName() , getName(),getAge(),getLivingArea());
    }
}
