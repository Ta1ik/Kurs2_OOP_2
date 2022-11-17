package Flowers;

public class Run {


    public static void main (String [] args) {
        Flowers roze = new Flowers("Роза", "Голландия", 35.59f, 0);
        Flowers chrisantem = new Flowers("Хризантема", "", 15f, 5);
        Flowers pion = new Flowers("Пион", "Англия", 69.9f, 1);
        Flowers hopsofyle = new Flowers("Гипсофила", "Турция", 19.5f, 10);
        System.out.println(roze);
        System.out.println(chrisantem);
        System.out.println(pion);
        System.out.println(hopsofyle);
        Flowers [] bouquet = new Flowers[4];
        bouquet[0] = roze;
        bouquet[1] = chrisantem;
        bouquet[2] = pion;
        bouquet[3] = hopsofyle;
        Flowers.sumBouquet(bouquet,3,5,1,1);

    }

}
