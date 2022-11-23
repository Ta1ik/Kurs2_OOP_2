package Animals;

public abstract class Mammals extends Animals{
    private final int speed;
    private final String typeFood;

    public Mammals(String name, int age, String livingArea, int speed, String typeFood) {
        super(name, age, livingArea);
        this.speed = validateSpeed(speed);
        this.typeFood = validateString(typeFood);
    }


    @Override
    public void eat() {
        System.out.println(Mammals.class.getSimpleName() + " " +getName() + " ест.");
    }

    @Override
    public void sleep() {
        System.out.println(Mammals.class.getSimpleName() + " " +getName() + " спит.");
    }

    @Override
    public void go() {
        System.out.println(Mammals.class.getSimpleName() + " " +getName() + " пермещается.");
    }

    @Override
    public void walk() {
        System.out.println(Mammals.class.getSimpleName() + " " +getName() + " прогуливается.");
    }

    public int getSpeed() {
        return speed;
    }

    public String getTypeFood() {
        return typeFood;
    }
}