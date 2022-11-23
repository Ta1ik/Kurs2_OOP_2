package Animals;

public class Flying extends Birds{
    public Flying(String name, int age, String livingArea, String typeMove) {
        super(name, age, livingArea, typeMove);
    }
    public void fly(){
        System.out.println(Flying.class.getSimpleName() + " " +getName() + " летает.");
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, %s. Имя: %s, возраст %d лет, ареал обитания: %s.", Birds.class.getSimpleName(),Flying.class.getSimpleName() , getName(),getAge(),getLivingArea());
    }
}