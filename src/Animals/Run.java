package Animals;

public class Run {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 3, "степь", 30, "трава");
        Herbivores girafe = new Herbivores("Жираф", 10, "саванна", 15, "листья");
        Herbivores horse = new Herbivores("Лошадь", 5, "степь", 50, "овощи");

        Predators hyena = new Predators("Гиена", 7, "степь", 35, "падаль");
        Predators tiger = new Predators("Тигр", 17, "тайга", 55, "мясо");
        Predators bear = new Predators("Медведь", 25, "тундра", 40, "мясо, ягоды");

        Amphibians frog = new Amphibians("Лягушка", 0, "болото");
        Amphibians snakeFreshwater = new Amphibians("Уж пресноводный", 1, "пресная вода");

        Flightless peacock = new Flightless("Павлин", 12, "джунгли", "бег");
        Flightless pinguin = new Flightless("Пингвин", 4, "вечная мерзлота", "прыжки");
        Flightless birdDodo = new Flightless("Птица Додо", 9, "", "хотьба");

        Flying gull = new Flying("Чайка",1,"побережье","летает");
        Flying albatros = new Flying("Альбатрос", 14, "острова","летает");
        Flying falcon = new Flying("Сокол", 1, "любой","летает");


        System.out.println(gazelle);
        System.out.println(girafe);
        System.out.println(horse);
        separatorAnimal();
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        separatorAnimal();
        System.out.println(frog);
        System.out.println(snakeFreshwater);
        separatorAnimal();
        System.out.println(peacock);
        System.out.println(pinguin);
        System.out.println(birdDodo);
        separatorAnimal();
        System.out.println(gull);
        System.out.println(albatros);
        System.out.println(falcon);
        separatorAnimal();

        System.out.println("Проверка на совпадение объектов.");
        System.out.println(girafe.equals(gazelle));
        System.out.println(girafe.equals(horse));
        System.out.println(gazelle.equals(horse));


    }
    public static void separatorAnimal(){
        System.out.println("________________________________________");
    }
}
