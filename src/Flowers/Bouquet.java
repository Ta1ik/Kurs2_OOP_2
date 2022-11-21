package Flowers;
import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flowers> bouquet;

    public Bouquet(){
        this.bouquet = new ArrayList<>();
    }

    public void addBouquet(Flowers flowers) {
        bouquet.add(flowers);
    }



    public void sumBouquet() {
        float sum = 0f;
        int dayLifeSpan = Integer.MAX_VALUE;
        for (Flowers flowers : bouquet) {
            sum = sum + flowers.getCost();
        }
        sum = sum *1.1f;
        for (Flowers flowers : bouquet) {
            if (dayLifeSpan > flowers.lifeSpan) {
                dayLifeSpan = flowers.lifeSpan;
            }
        }
        System.out.printf("Сумма букета составляет: %.2f рублей. Букет простоит: %d суток. \n", sum, dayLifeSpan);
    }
}