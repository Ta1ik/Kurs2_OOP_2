package Animals;

public abstract class Birds extends Animals{
    private final String  typeMove;

    public Birds(String name, int age, String livingArea, String typeMove) {
        super(name, age, livingArea);
        this.typeMove = validateString(typeMove);
    }


    @Override
    public void eat() {
        System.out.println(Birds.class.getSimpleName() + " " +getName() + " кушает.");
    }

    @Override
    public void sleep() {
        System.out.println(Birds.class.getSimpleName() + " " +getName() + " спит.");
    }

    @Override
    public void go() {
        System.out.println(Birds.class.getSimpleName() + " " +getName() + " перемещается.");
    }

    @Override
    public void hunt() {
        System.out.println(Birds.class.getSimpleName() + " " +getName() + " охотится.");
    }


    public String getTypeMove() {
        return typeMove;
    }
}
