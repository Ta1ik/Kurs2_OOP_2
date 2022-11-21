package Flowers;

public class Run {

    public static void main(String[] args) {
        Flowers roze = new Flowers("Роза", "Голландия", 35.59f, 0);
        Flowers chrisantem = new Flowers("Хризантема", "", 15f, 5);
        Flowers pion = new Flowers("Пион", "Англия", 69.9f, 1);
        Flowers hopsofyle = new Flowers("Гипсофила", "Турция", 19.5f, 10);
        System.out.println(roze);
        System.out.println(chrisantem);
        System.out.println(pion);
        System.out.println(hopsofyle);

        Bouquet bouquet = new Bouquet();
        bouquet.addBouquet(roze);
        bouquet.addBouquet(roze);
        bouquet.addBouquet(roze);
        bouquet.addBouquet(chrisantem);
        bouquet.addBouquet(chrisantem);
        bouquet.addBouquet(chrisantem);
        bouquet.addBouquet(chrisantem);
        bouquet.addBouquet(chrisantem);
        bouquet.addBouquet(hopsofyle);
        bouquet.sumBouquet();

    }

}
